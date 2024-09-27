import javax.activation.CommandInfo;

public class CommandInfo_2 {
    public static void main(String[] args) {
        CommandInfo commandInfo = new CommandInfo("commandName", "className");
        String commandName = commandInfo.getCommandName();
        System.out.println("Command Name: " + commandName);
    }
}
