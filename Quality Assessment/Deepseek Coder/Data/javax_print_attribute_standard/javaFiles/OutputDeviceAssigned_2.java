import javax.print.attribute.standard.OutputDeviceAssigned;

public class OutputDeviceAssigned_2 {
    public static void main(String[] args) {
        OutputDeviceAssigned outputDeviceAssigned1 = new OutputDeviceAssigned(true);
        OutputDeviceAssigned outputDeviceAssigned2 = new OutputDeviceAssigned(true);

        boolean isEqual = outputDeviceAssigned1.equals(outputDeviceAssigned2);
        System.out.println(isEqual);
    }
}
