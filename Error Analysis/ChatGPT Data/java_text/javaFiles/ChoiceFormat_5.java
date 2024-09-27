import java.text.ChoiceFormat;

public class ChoiceFormat_5 {
    public static void main(String[] args) {
        // Define an array of limits
        double[] limits = {1, 2, 3, 4, 5};
        
        // Creating a ChoiceFormat object with specified limits
        ChoiceFormat cf = new ChoiceFormat(limits);
        
        // Get the limits array from ChoiceFormat object
        double[] retrievedLimits = cf.getLimits();
        
        // Printing the retrieved limits
        for (double limit : retrievedLimits) {
            System.out.println(limit);
        }
    }
}
