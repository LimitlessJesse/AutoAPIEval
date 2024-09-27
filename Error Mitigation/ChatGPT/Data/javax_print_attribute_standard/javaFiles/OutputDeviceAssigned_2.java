import javax.print.attribute.standard.OutputDeviceAssigned;

public class OutputDeviceAssigned_2 {
    public static void main(String[] args) {
        OutputDeviceAssigned attribute = new OutputDeviceAssigned("Printer1");
        Class<? extends Attribute> category = attribute.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
