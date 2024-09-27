import javax.activation.FileDataSource;

public class FileDataSource_4 {
    public static void main(String[] args) {
        FileDataSource fileDataSource = new FileDataSource("example.txt");
        String name = fileDataSource.getName();
        System.out.println("File name: " + name);
    }
}
