import javax.print.attribute.standard.JobKOctets;

public class JobKOctets_3 {
    public static void main(String[] args) {
        // Create an instance of JobKOctets
        JobKOctets jobKOctets = new JobKOctets(1000);

        // Get the category of the JobKOctets attribute
        Class<? extends Attribute> category = jobKOctets.getCategory();

        // Print the category
        System.out.println("Category: " + category.getName());
    }
}
