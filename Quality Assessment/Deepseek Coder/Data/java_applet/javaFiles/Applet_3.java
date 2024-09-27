import java.applet.Applet;

public class Applet_3 {
    public static void main(String[] args) {
        Applet applet = new Applet() {
            @Override
            public void init() {
                System.out.println("Applet initialized");
            }

            @Override
            public void start() {
                System.out.println("Applet started");
            }

            @Override
            public void stop() {
                System.out.println("Applet stopped");
            }

            @Override
            public void destroy() {
                System.out.println("Applet destroyed");
            }
        };

        applet.init();
        applet.start();
        applet.stop();
        applet.destroy();
    }
}
