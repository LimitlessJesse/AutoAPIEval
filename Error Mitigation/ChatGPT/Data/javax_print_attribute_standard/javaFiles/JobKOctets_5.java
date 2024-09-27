import javax.print.attribute.standard.JobKOctets;

public class JobKOctets_5 {
    public static void main(String[] args) {
        JobKOctets jobKOctets = new JobKOctets(1024);
        Class<? extends Attribute> category = jobKOctets.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
