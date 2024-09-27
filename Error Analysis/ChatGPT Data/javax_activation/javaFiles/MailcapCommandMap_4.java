import javax.activation.CommandInfo;
import javax.activation.MailcapCommandMap;

public class MailcapCommandMap_4 {
    public static void main(String[] args) {
        MailcapCommandMap mailcapCommandMap = new MailcapCommandMap();
        CommandInfo[] allCommands = mailcapCommandMap.getAllCommands("text/plain");
        for (CommandInfo commandInfo : allCommands) {
            System.out.println(commandInfo.getCommandName());
        }
    }
}
