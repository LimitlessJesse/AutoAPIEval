import java.util.prefs.NodeChangeEvent;
import java.util.prefs.Preferences;

public class NodeChangeEvent_1 {
    public static void main(String[] args) {
        NodeChangeEvent event = new NodeChangeEvent(new Preferences() {
            @Override
            public Preferences node(String pathName) {
                return null;
            }

            @Override
            public boolean nodeExists(String pathName) throws IllegalStateException {
                return false;
            }

            @Override
            public void removeNode() throws IllegalStateException {
                
            }

            @Override
            public String[] childrenNames() throws IllegalStateException {
                return new String[0];
            }

            @Override
            public Preferences parent() {
                return null;
            }

            @Override
            public void put(String key, String value) {
                
            }

            @Override
            public String get(String key, String def) {
                return null;
            }

            @Override
            public void remove(String key) {
                
            }

            @Override
            public void clear() throws IllegalStateException {
                
            }

            @Override
            public void flush() throws IllegalStateException {
                
            }

            @Override
            public void sync() throws IllegalStateException {
                
            }
        }, new Preferences() {
            @Override
            public Preferences node(String pathName) {
                return null;
            }

            @Override
            public boolean nodeExists(String pathName) throws IllegalStateException {
                return false;
            }

            @Override
            public void removeNode() throws IllegalStateException {
                
            }

            @Override
            public String[] childrenNames() throws IllegalStateException {
                return new String[0];
            }

            @Override
            public Preferences parent() {
                return null;
            }

            @Override
            public void put(String key, String value) {
                
            }

            @Override
            public String get(String key, String def) {
                return null;
            }

            @Override
            public void remove(String key) {
                
            }

            @Override
            public void clear() throws IllegalStateException {
                
            }

            @Override
            public void flush() throws IllegalStateException {
                
            }

            @Override
            public void sync() throws IllegalStateException {
                
            }
        });
        
        Preferences childNode = event.getChild();
        System.out.println("Child node: " + childNode);
    }
}
