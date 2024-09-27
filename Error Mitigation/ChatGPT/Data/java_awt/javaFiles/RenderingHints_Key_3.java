import java.awt.RenderingHints;

public class RenderingHints_Key_3 {
    public static void main(String[] args) {
        RenderingHints.Key key = new RenderingHints.Key("test") {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
        
        int hashCode = key.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
