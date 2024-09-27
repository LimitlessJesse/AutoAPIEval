import java.applet.Applet;
import java.net.MalformedURLException;
import java.net.URL;

public class Applet_2 extends Applet {
    public void play(URL url) {
        try {
            getAppletContext().showDocument(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.example.com/example.mp3");
            Main main = new Main();
            main.play(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
