import javax.management.loading.MLet;
import java.net.URL;

public class MLet_1 {
    public static void main(String[] args) {
        MLet mLet = new MLet();
        try {
            URL url = new URL("http://example.com");
            mLet.addURL(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
