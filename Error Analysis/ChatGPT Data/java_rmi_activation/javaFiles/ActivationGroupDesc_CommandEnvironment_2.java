import java.rmi.activation.ActivationGroupDesc;

public class ActivationGroupDesc_CommandEnvironment_2 {
    public static void main(String[] args) {
        ActivationGroupDesc.CommandEnvironment commandEnvironment = new ActivationGroupDesc.CommandEnvironment();
        String[] commandOptions = commandEnvironment.getCommandOptions();
        for (String option : commandOptions) {
            System.out.println(option);
        }
    }
}
