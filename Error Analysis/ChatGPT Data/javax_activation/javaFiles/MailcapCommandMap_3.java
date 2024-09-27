import javax.activation.MailcapCommandMap;
import javax.activation.CommandInfo;

public class MailcapCommandMap_3 {
    public static void main(String[] args) {
        MailcapCommandMap mailcap = new MailcapCommandMap();
        CommandInfo commandInfo = mailcap.getCommand("text/plain", "view");
        System.out.println(commandInfo);
    }
}
