import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionBindingEvent;

public class SSLSessionBindingEvent_3 {
    public static void main(String[] args) {
        SSLSessionBindingEvent event = new SSLSessionBindingEvent(new SSLSession() {
            @Override
            public byte[] getId() {
                return new byte[0];
            }

            @Override
            public SSLSessionContext getSessionContext() {
                return null;
            }

            @Override
            public long getCreationTime() {
                return 0;
            }

            @Override
            public long getLastAccessedTime() {
                return 0;
            }

            @Override
            public void invalidate() {

            }

            @Override
            public boolean isValid() {
                return false;
            }

            @Override
            public void putValue(String s, Object o) {

            }

            @Override
            public Object getValue(String s) {
                return null;
            }

            @Override
            public void removeValue(String s) {

            }

            @Override
            public String[] getValueNames() {
                return new String[0];
            }
        }, "listenerName");

        SSLSession session = event.getSession();
        System.out.println(session);
    }
}
