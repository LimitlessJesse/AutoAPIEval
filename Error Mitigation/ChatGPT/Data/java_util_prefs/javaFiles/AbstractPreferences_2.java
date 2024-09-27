import java.util.prefs.AbstractPreferences;

public class AbstractPreferences_2 {
    public static void main(String[] args) {
        AbstractPreferences preferences = new AbstractPreferences() {
            @Override
            public void put(String key, String value) {
                if (key == null || value == null) {
                    throw new NullPointerException();
                }
                if (key.length() > MAX_KEY_LENGTH || value.length() > MAX_VALUE_LENGTH) {
                    throw new IllegalArgumentException();
                }
                // Obtain lock
                synchronized (this.lock) {
                    // Check if node has been removed
                    if (isRemoved()) {
                        throw new IllegalStateException();
                    }
                    // Invoke putSpi method
                    putSpi(key, value);
                    // Enqueue notification event for preference change listeners
                    if (changeListeners != null) {
                        enqueuePreferenceChangeEvent(key, value);
                    }
                }
            }
        };
        
        // Example usage
        preferences.put("key1", "value1");
    }
}
