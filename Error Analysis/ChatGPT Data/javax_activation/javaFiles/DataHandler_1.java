import javax.activation.DataHandler;

public class DataHandler_1 {
    public static void main(String[] args) {
        DataHandler dataHandler = new DataHandler("example.txt");
        
        try {
            InputStream inputStream = dataHandler.getInputStream();
            int data = inputStream.read();
            while(data != -1) {
                System.out.print((char)data);
                data = inputStream.read();
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
