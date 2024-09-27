import java.io.InputStream;

public class ClassLoader_4 {
    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoader_4.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("file.txt");

        try {
            int data = inputStream.read();
            while (data!= -1) {
                System.out.print((char) data);
                data = inputStream.read();
            }
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
