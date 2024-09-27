import java.io.FilterReader;
import java.io.StringReader;
import java.io.IOException;

public class FilterReader_4 {
    public static void main(String[] args) {
        String data = "Hello World!";
        StringReader reader = new StringReader(data);
        
        try {
            FilterReader filterReader = new FilterReader(reader) {
                @Override
                public long skip(long n) throws IOException {
                    return super.skip(n);
                }
            };
            
            // Skipping 6 characters
            long skipped = filterReader.skip(6);
            System.out.println("Skipped " + skipped + " characters");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
