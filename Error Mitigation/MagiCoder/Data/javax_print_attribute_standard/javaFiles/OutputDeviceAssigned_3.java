import javax.print.attribute.standard.OutputDeviceAssigned;

public class OutputDeviceAssigned_3 {
    public static void main(String[] args) {
        OutputDeviceAssigned outputDeviceAssigned1 = new OutputDeviceAssigned("device1");
        OutputDeviceAssigned outputDeviceAssigned2 = new OutputDeviceAssigned("device2");

        System.out.println(outputDeviceAssigned1.equals(outputDeviceAssigned2));
    }
}
