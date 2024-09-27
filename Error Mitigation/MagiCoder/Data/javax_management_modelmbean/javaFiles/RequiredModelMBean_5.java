import javax.management.modelmbean.RequiredModelMBean;

public class RequiredModelMBean_5 {
    public static void main(String[] args) {
        // Create a RequiredModelMBean instance
        RequiredModelMBean mbean = new RequiredModelMBean() {
            // Implement the getAttribute method
            @Override
            public Object getAttribute(String attribute) {
                // Implement the logic to get the attribute value
                // For example, if the attribute is "name", return "John Doe"
                if (attribute.equals("name")) {
                    return "John Doe";
                }
                // If the attribute is not recognized, return null
                return null;
            }
        };

        // Get the attribute value
        Object attributeValue = mbean.getAttribute("name");
        System.out.println(attributeValue);  // Output: John Doe
    }
}
