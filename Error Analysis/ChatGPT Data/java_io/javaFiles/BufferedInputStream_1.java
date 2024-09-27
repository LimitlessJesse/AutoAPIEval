import java.io.BufferedInputStream;
import java.io.IOException;

public class BufferedInputStream_1 {
    public static void main(String[] args) {
        try {
            BufferedInputStream bis = new BufferedInputStream(System.in);
            int inputData = bis.read();
            System.out.println("Input data: " + inputData);
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
