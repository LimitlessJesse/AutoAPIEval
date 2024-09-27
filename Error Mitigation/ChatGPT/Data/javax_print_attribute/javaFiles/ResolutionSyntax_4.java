import javax.print.attribute.ResolutionSyntax;

public class ResolutionSyntax_4 {
    public static void main(String[] args) {
        ResolutionSyntax resolution = new ResolutionSyntax() {
            @Override
            public int[] getResolution(int units) {
                // Implementation of getting resolution values
                int[] resolutionValues = new int[2];
                // Example values
                resolutionValues[0] = 300; // Cross feed direction resolution
                resolutionValues[1] = 300; // Feed direction resolution
                return resolutionValues;
            }
        };

        int[] resolutionValues = resolution.getResolution(300);
        System.out.println("Cross feed direction resolution: " + resolutionValues[0]);
        System.out.println("Feed direction resolution: " + resolutionValues[1]);
    }
}
