import javax.print.StreamPrintService;

public class StreamPrintService_2 {
    public static void main(String[] args) {
        StreamPrintService printService = new StreamPrintService() {
            @Override
            public String getOutputFormat() {
                return "application/pdf"; // Example output format
            }
        };

        System.out.println("Output format: " + printService.getOutputFormat());
    }
}
