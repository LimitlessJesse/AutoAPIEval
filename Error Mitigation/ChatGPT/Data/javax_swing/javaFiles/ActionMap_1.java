import javax.swing.Action;
import javax.swing.ActionMap;

public class ActionMap_1 {
    public static void main(String[] args) {
        ActionMap actionMap = new ActionMap();
        Action action = new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };

        Object key = "key";
        actionMap.put(key, action);
    }
}
