import java.rmi.server.LogStream;

public class LogStream_5 {
    public static void main(String[] args) {
        LogStream logStream = new LogStream();
        logStream.write(65); // Writing byte 'A' to the stream
    }
}
