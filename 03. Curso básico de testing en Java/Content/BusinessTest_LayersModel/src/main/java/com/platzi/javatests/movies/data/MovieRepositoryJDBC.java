package com.platzi.javatests.movies.data;

import com.platzi.javatests.movies.model.Genre;
import com.platzi.javatests.movies.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

public class MovieRepositoryJDBC implements MovieRepository {

    private JdbcTemplate jdbcTemplate;

    public MovieRepositoryJDBC(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Movie findById(long id) {
        Object[] args = { id };
        return jdbcTemplate.queryForObject("select * from movies where id = ?", args, movieMapper);
    }

    @Override
    public Collection<Movie> findAll() {
        return jdbcTemplate.query("select * from movies", movieMapper);
    }

    @Override
    public void saveOrUpdate(Movie movie) {
        jdbcTemplate.update("insert into movies (name, minutes, genre) values (?, ?, ?)",
                movie.getName(), movie.getMinutes(), movie.getGenre().toString());
    }

    //Original code before implementing Lambda
//    private static RowMapper<Movie> movieMapper = new RowMapper<Movie>() {
//        @Override
//        public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
//            return new Movie(rs.getInt("id"),
//                    rs.getString("name"),
//                    rs.getInt("minutes"),
//                    Genre.valueOf(rs.getString("genre")));
//        }
//    };
//    private static RowMapper<Movie> movieMapper = (rs, rowNum) -> new Movie(rs.getInt("id"),
//            rs.getString("name"),
//            rs.getInt("minutes"),
//            Genre.valueOf(rs.getString("genre")));
//}
    private static RowMapper<Movie> movieMapper = (rs, rowNum) ->
            new Movie(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("minutes"),
                    Genre.valueOf(rs.getString("genre")));
}