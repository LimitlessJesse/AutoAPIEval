import java.nio.channels.AsynchronousChannelProvider;

public class AsynchronousChannelProvider_2 {
    public static void main(String[] args) {
        AsynchronousChannelProvider provider = AsynchronousChannelProvider.provider();
        System.out.println(provider);
    }
}
