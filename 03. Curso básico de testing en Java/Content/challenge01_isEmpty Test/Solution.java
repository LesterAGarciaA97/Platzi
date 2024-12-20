public static boolean isEmpty(String str) {
    return str == null || str.trim().length() <= 0;
}

@Test
    public void word_is_not_empty() {

        assertFalse(StringUtil.isEmpty("Palabra"));
    }

    @Test
    public void quotationMarks_is_Empty() {

        assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void space_is_Empty() {

        String str = new String(" ");

        assertTrue(StringUtil.isEmpty(str));
    }

    @Test
    public void null_is_empty() {

        assertTrue(StringUtil.isEmpty(null));
    }