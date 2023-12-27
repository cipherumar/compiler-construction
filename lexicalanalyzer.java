public class CommentRemover {
    public static String removeComments(String code) {
        // Remove single-line comments
        code = code.replaceAll("(?<!['\"\\\\])//.*", "");

        // Remove multi-line comments
        code = code.replaceAll("/\\*(.|[\\n\\r])*?\\*/", "");

        return code;
    }

    public static void main(String[] args) {
        // Example code with comments
        String codeWithComments = "public class HelloWorld {\n" +
                "    // This is a single-line comment\n" +
                "    public static void main(String[] args) {\n" +
                "        /*\n" +
                "         * This is a multi-line comment\n" +
                "         */\n" +
                "        System.out.println(\"Hello, World!\");\n" +
                "    }\n" +
                "}\n";

        // Remove comments
        String codeWithoutComments = removeComments(codeWithComments);

        // Print the code without comments
        System.out.println(codeWithoutComments);
        System.out.println(codeWithoutComments);

        System.out.println(codeWithoutComments);

        System.out.println(codeWithoutComments);

    }
}
