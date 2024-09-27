import javax.activation.CommandInfo;

public class CommandInfo_1 {
    public static void main(String[] args) {
        CommandInfo commandInfo = new CommandInfo() {
            @Override
            public String getCommandName() {
                return "getCommandName";
            }
        };

        System.out.println(commandInfo.getCommandName());
    }
}
