import javax.management.loading.MLet;
import java.net.URL;

public class MLet_1 {
    public static void main(String[] args) {
        MLet mLet = new MLet();
        try {
            mLet.addURL(new URL("https://example.com/example.jar"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
