import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStream_4 {
    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write("Hello, World!".getBytes());
        System.out.println("Before reset: " + baos.toString());
        
        baos.reset();
        System.out.println("After reset: " + baos.toString());
    }
}
