import javax.activation.CommandInfo;

public class CommandInfo_1 {
    public static void main(String[] args) {
        CommandInfo commandInfo = new CommandInfo("exampleCommand", "exampleCommandClass");
        String commandClass = commandInfo.getCommandClass();
        System.out.println("Command Class: " + commandClass);
    }
}
