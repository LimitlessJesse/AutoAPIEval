import java.text.MessageFormat;

public class MessageFormat_1 {
    public static void main(String[] args) {
        String pattern = "boolean add(E e)";
        String description = "This method appends the specified element to the end of this list.";
        String codeSnippet = MessageFormat.format("public class MessageFormat_1 {\n" +
                "    public static void main(String[] args) {\n" +
                "        ArrayList<String> list = new ArrayList<>();\n" +
                "        list.{0}('Hello');\n" +
                "        System.out.println(list);\n" +
                "    }\n" +
                "}", pattern);

        System.out.println(description);
        System.out.println("Code snippet:");
        System.out.println(codeSnippet);
    }
}
