import java.applet.Applet;
import java.applet.AppletContext;

public class Applet_5 {
    public static void main(String[] args) {
        MyApplet applet = new MyApplet();
        AppletContext context = applet.getAppletContext();
        System.out.println(context);
    }
}

class MyApplet extends Applet {
    // Your applet code here
}
