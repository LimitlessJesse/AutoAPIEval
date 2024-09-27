import javax.print.attribute.ResolutionSyntax;

public class ResolutionSyntax_5 {
    public static void main(String[] args) {
        ResolutionSyntax resolution1 = new ResolutionSyntax() {
            @Override
            public boolean lessThanOrEquals(ResolutionSyntax other) {
                // Compare cross feed direction resolution
                if (this.getCrossFeedResolution() <= other.getCrossFeedResolution()) {
                    // Compare feed direction resolution
                    if (this.getFeedResolution() <= other.getFeedResolution()) {
                        return true;
                    }
                }
                return false;
            }
        };

        ResolutionSyntax resolution2 = new ResolutionSyntax() {
            @Override
            public int getCrossFeedResolution() {
                return 300; // Example value
            }

            @Override
            public int getFeedResolution() {
                return 300; // Example value
            }
        };

        System.out.println(resolution1.lessThanOrEquals(resolution2));
    }
}
