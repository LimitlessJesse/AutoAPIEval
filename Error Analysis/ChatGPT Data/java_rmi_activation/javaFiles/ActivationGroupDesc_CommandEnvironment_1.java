import java.rmi.activation.ActivationGroupDesc.CommandEnvironment;

public class ActivationGroupDesc_CommandEnvironment_1 {
    public static void main(String[] args) {
        CommandEnvironment env = new CommandEnvironment("", new String[]{}, new String[]{});
        String commandPath = env.getCommandPath();
        System.out.println("Command Path: " + commandPath);
    }
}
