import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOutputStream_4 {
    public static void main(String[] args) {
        MyFilterOutputStream outputStream = new MyFilterOutputStream();
        try {
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class MyFilterOutputStream extends FilterOutputStream {
        MyFilterOutputStream() {
            super(System.out);
        }
    }
}
