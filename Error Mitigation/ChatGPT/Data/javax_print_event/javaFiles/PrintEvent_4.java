import javax.print.event.PrintEvent;

public class PrintEvent_4 {
    public static void main(String[] args) {
        PrintEvent event = new PrintEvent(new Object());
        System.out.println(event.toString());
    }
}
