import java.rmi.activation.ActivationGroupDesc.CommandEnvironment;

public class ActivationGroupDesc_CommandEnvironment_1 {
    public static void main(String[] args) {
        CommandEnvironment commandEnv = new CommandEnvironment();
        String commandPath = commandEnv.getCommandPath();
        System.out.println("Command Path: " + commandPath);
    }
}
