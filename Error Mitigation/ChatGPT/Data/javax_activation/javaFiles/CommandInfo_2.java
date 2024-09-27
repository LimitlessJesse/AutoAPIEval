import javax.activation.CommandInfo;

public class CommandInfo_2 {
    public static void main(String[] args) {
        CommandInfo commandInfo = new CommandInfo();
        String commandName = commandInfo.getCommandName();
        System.out.println("Command Name: " + commandName);
    }
}
