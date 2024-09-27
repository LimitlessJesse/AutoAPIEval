import org.omg.CORBA.portable.OutputStream;

public class OutputStream_5 {
    public static void main(String[] args) {
        OutputStream outputStream = new OutputStream() {
            @Override
            public void write_string(String value) {
                System.out.println("Writing string value: " + value);
            }
        };
        
        String value = "Hello, CORBA!";
        outputStream.write_string(value);
    }
}
