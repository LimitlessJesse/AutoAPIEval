import java.rmi.server.LogStream;

public class LogStream_4 {
    public static void main(String[] args) {
        LogStream logStream = new LogStream();
        byte[] data = {65, 66, 67, 68, 69}; // Sample byte array
        int offset = 1;
        int length = 3;
        
        logStream.write(data, offset, length);
    }
}
