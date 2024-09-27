import javax.rmi.CORBA.Util;
import java.io.InputStream;

public class Util_5 {
    public static void main(String[] args) {
        InputStream inputStream = // initialize your input stream here
        Object object = Util.readAny(inputStream);
        System.out.println("Object read from stream: " + object);
    }
}
