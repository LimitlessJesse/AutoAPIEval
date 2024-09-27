import javax.print.attribute.standard.OutputDeviceAssigned;

public class OutputDeviceAssigned_4 {
    public static void main(String[] args) {
        OutputDeviceAssigned attribute1 = new OutputDeviceAssigned("Printer1");
        OutputDeviceAssigned attribute2 = new OutputDeviceAssigned("Printer1");

        System.out.println("Are attributes equal? " + attribute1.equals(attribute2));
    }
}
