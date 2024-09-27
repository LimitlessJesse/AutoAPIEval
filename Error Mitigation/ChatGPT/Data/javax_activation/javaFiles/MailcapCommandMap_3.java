import javax.activation.CommandMap;
import javax.activation.CommandInfo;
import javax.activation.MailcapCommandMap;

public class MailcapCommandMap_3 {
    public static void main(String[] args) {
        MailcapCommandMap mailcapCommandMap = new MailcapCommandMap();
        CommandInfo commandInfo = mailcapCommandMap.getCommand("text/plain", "view");
        System.out.println(commandInfo);
    }
}
