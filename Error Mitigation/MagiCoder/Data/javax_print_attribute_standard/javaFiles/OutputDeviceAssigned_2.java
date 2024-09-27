import javax.print.attribute.standard.OutputDeviceAssigned;

public class OutputDeviceAssigned_2 {
    public static void main(String[] args) {
        OutputDeviceAssigned outputDeviceAssigned = new OutputDeviceAssigned();
        String categoryName = outputDeviceAssigned.getName();
        System.out.println("Category name: " + categoryName);
    }
}
