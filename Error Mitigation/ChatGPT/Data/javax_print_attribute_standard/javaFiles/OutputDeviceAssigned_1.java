import javax.print.attribute.standard.OutputDeviceAssigned;

public class OutputDeviceAssigned_1 {
    public static void main(String[] args) {
        OutputDeviceAssigned attribute = new OutputDeviceAssigned("Printer1");
        String categoryName = attribute.getName();
        System.out.println("Category Name: " + categoryName);
    }
}
