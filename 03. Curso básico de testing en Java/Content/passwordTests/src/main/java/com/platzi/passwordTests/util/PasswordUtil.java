package com.platzi.passwordTests.util;

import java.sql.PseudoColumnUsage;

public class PasswordUtil {
    public enum SecurityLevel{
        WEAK, MEDIUM, STRONG
    }
    public static  SecurityLevel assessPassword(String password){
        if (password.length()<8){
            return SecurityLevel.WEAK;
        }
        if (password.matches("[a-zA-Z]+")){ //Expresión regular [a-zA-Z]+ significa que tiene letras de la a a la z mayus y minus varias veces
            return SecurityLevel.WEAK;
        }
        if (password.matches("[a-zA-Z0-9]+")){
            return SecurityLevel.MEDIUM;
        }
        return SecurityLevel.STRONG;
    }
}