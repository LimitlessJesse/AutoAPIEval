import javax.activation.CommandInfo;
import javax.activation.MailcapCommandMap;

public class MailcapCommandMap_2 {
    public static void main(String[] args) {
        MailcapCommandMap mailcapCommandMap = new MailcapCommandMap();
        CommandInfo[] commands = mailcapCommandMap.getAllCommands("text/plain");
        
        for(CommandInfo command : commands) {
            System.out.println(command.getCommandName());
            System.out.println(command.getCommandClass());
        }
    }
}
