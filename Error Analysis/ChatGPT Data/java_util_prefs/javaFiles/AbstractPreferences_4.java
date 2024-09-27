import java.util.prefs.AbstractPreferences;

public class AbstractPreferences_4 {
    public static void main(String[] args) {
        AbstractPreferences preferences = new AbstractPreferences() {
            @Override
            protected boolean isUserNode() {
                return false;
            }

            @Override
            protected <T> T lock() {
                return null;
            }

            @Override
            protected void unlock() {
                
            }

            @Override
            protected void sync() throws BackingStoreException {
                
            }

            @Override
            protected void flush() throws BackingStoreException {
                
            }

            @Override
            protected void putSpi(String key, String value) {
                
            }

            @Override
            protected String getSpi(String key) {
                return null;
            }

            @Override
            protected void removeSpi(String key) {
                
            }

            @Override
            protected void removeNodeSpi() throws BackingStoreException {
                
            }

            @Override
            protected String[] keysSpi() throws BackingStoreException {
                return new String[0];
            }

            @Override
            protected String[] childrenNamesSpi() throws BackingStoreException {
                return new String[0];
            }

            @Override
            protected AbstractPreferences childSpi(String name) {
                return null;
            }
        };
        
        System.out.println("isUserNode: " + preferences.isUserNode());
    }
}
