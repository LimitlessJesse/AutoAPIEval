import java.util.prefs.AbstractPreferences;

public class AbstractPreferences_1 {
    public static void main(String[] args) {
        AbstractPreferences prefs = new AbstractPreferences() {
            @Override
            public String get(String key, String def) {
                return null;
            }

            @Override
            public void put(String key, String value) {

            }

            @Override
            public void remove(String key) {

            }

            @Override
            public void removeNode() {

            }

            @Override
            public String[] keys() {
                return new String[0];
            }

            @Override
            public String[] childrenNames() {
                return new String[0];
            }

            @Override
            public AbstractPreferences nodeExists(String key) {
                return null;
            }
        };

        boolean exists = prefs.nodeExists("key")!= null;
        System.out.println("Node exists: " + exists);
    }
}
