import javax.sound.sampled.Port;

public class Port_Info_4 {
    public static void main(String[] args) {
        Port.Info portInfo = new Port.Info(Port.class, "My Port", true);
        boolean isSource = portInfo.isSource();
        System.out.println("Is source: " + isSource);
    }
}
