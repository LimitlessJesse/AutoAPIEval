import javax.imageio.stream.FileCacheImageOutputStream;

public class FileCacheImageOutputStream_4 {
    public static void main(String[] args) {
        FileCacheImageOutputStream output = new FileCacheImageOutputStream("output.txt");
        
        try {
            output.write(65); // Writing ASCII value of 'A'
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                output.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
