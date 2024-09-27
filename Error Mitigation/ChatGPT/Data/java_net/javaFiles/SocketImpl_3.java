import java.io.IOException;
import java.net.SocketImpl;

public class SocketImpl_3 {
    public static void main(String[] args) {
        MySocketImpl socketImpl = new MySocketImpl();
        try {
            socketImpl.create(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class MySocketImpl extends SocketImpl {
        @Override
        protected void create(boolean stream) throws IOException {
            if (stream) {
                System.out.println("Creating a stream socket");
            } else {
                System.out.println("Creating a datagram socket");
            }
        }
    }
}
