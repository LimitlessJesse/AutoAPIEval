import java.util.prefs.AbstractPreferences;

public class AbstractPreferences_2 {
    public static void main(String[] args) {
        AbstractPreferences prefs = new AbstractPreferences() {
            @Override
            protected String[] keys() {
                return new String[0];
            }

            @Override
            protected String getSys(String key, String def) {
                return null;
            }

            @Override
            protected void putSys(String key, String value) {

            }

            @Override
            protected void removeSys(String key) {

            }

            @Override
            protected void removeNodeSys() {

            }
        };

        boolean result = prefs.getBoolean("key", true);
        System.out.println(result);
    }
}
