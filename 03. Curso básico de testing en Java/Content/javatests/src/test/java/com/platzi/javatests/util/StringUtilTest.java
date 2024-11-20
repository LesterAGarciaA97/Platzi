package com.platzi.javatests.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {
    //public static void main(String[] args) {
        String result = StringUtil.repeat("hola", 3);
        //System.out.println(result);
//        if (result.equals("holaholahola")) {
//            System.out.println("OK");
//        }
//        if (!result.equals("holaholahola")) {
//            System.out.println("ERROR");
//        }
//        if (!result.equals("holaholahola")) {
//            throw new RuntimeException("ERROR");
//        }
        //assertEquals(result, "holaholahola");
        @Test
        public void testRepeat(){
            Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 3));
            Assert.assertEquals("hola", StringUtil.repeat("hola", 1));
        }

        //String result2 = StringUtil.repeat("hola", 1);
        //System.out.println(result2);
//        if (result2.equals("hola")) {
//            System.out.println("OK");
//        }
//        if (!result2.equals("hola")) {
//            System.out.println("ERROR");
//        }
//        if (!result2.equals("holahola")) {
//            throw new RuntimeException("ERROR");
//        }
        //assertEquals(result2, "hola");
    }
//
//    private static void assertEquals(String actual, String expected) {
//        if (!actual.equals(expected)) {
//            throw new RuntimeException(actual + " is not equal to " + expected);
//        }
//    }