import java.lang.StringBuffer;

public class StringBuffer_13 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello, World!");
        int index = sb.lastIndexOf("o");
        System.out.println("The last index of 'o' is: " + index);
    }
}
