import javax.sound.sampled.Port;
import javax.sound.sampled.Port.Info;

public class Port_Info_2 {
    public static void main(String[] args) {
        Port.Info portInfo = new Port.Info(Port.class, "Any Port Name", false);
        String portName = portInfo.getName();
        System.out.println("Port name: " + portName);
    }
}
