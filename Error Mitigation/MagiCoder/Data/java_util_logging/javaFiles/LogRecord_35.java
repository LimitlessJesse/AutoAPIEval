import java.util.logging.LogRecord;

public class LogRecord_35 {
    public static void main(String[] args) {
        LogRecord logRecord = new LogRecord(null, null);
        logRecord.setSequenceNumber(1234567890L);
        System.out.println("Sequence Number: " + logRecord.getSequenceNumber());
    }
}
