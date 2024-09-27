import javax.print.StreamPrintService;

public class StreamPrintService_2 {
    public static void main(String[] args) {
        StreamPrintService streamPrintService = new StreamPrintService();
        OutputStream outputStream = streamPrintService.getOutputStream();
        // You can now write to outputStream to communicate with the printer
    }
}
