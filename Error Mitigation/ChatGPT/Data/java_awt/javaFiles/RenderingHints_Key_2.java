import java.awt.RenderingHints;

public class RenderingHints_Key_2 {
    public static void main(String[] args) {
        RenderingHints.Key key1 = new RenderingHints.Key("key1") {
            // Implementing the equals method
            public boolean equals(Object o) {
                if (this == o) {
                    return true;
                }
                if (o == null || getClass() != o.getClass()) {
                    return false;
                }
                RenderingHints.Key key = (RenderingHints.Key) o;
                return this.toString().equals(key.toString());
            }
        };

        RenderingHints.Key key2 = new RenderingHints.Key("key2");

        System.out.println("key1 equals key2: " + key1.equals(key2));
    }
}
