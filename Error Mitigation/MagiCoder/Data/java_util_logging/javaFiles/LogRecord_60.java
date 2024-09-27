import java.util.logging.LogRecord;

public class LogRecord_60 {
    public static void main(String[] args) {
        LogRecord logRecord = new LogRecord(null, null);
        long sequenceNumber = logRecord.getSequenceNumber();
        System.out.println("Sequence Number: " + sequenceNumber);
    }
}
