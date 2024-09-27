import java.io.FilterReader;
import java.io.FileReader;
import java.io.IOException;

public class FilterReader_3 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("file.txt");
            FilterReader filterReader = new FilterReader(fileReader) {
                @Override
                public boolean ready() throws IOException {
                    return super.ready();
                }
            };
            System.out.println("Is reader ready: " + filterReader.ready());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
