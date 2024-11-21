@Override
public Collection<Movie> findByName(String name) {
  String[] args = {"%" + name.toLowerCase() + "%"};
  return jdbcTemplate.query("SELECT * FROM movies WHERE LOWER(name) LIKE ?", args, movieMapper);
}