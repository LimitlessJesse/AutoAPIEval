import java.util.zip.Inflater;

public class Inflater_14 {
    public static void main(String[] args) {
        Inflater inflater = new Inflater();
        System.out.println("Initial Adler-32 checksum: " + inflater.getAdler());
        
        byte[] data = {1, 2, 3, 4, 5};
        inflater.setInput(data);
        
        System.out.println("Adler-32 checksum after input: " + inflater.getAdler());
    }
}
