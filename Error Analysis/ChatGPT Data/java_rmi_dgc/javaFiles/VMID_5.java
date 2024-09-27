import java.rmi.dgc.VMID;

public class VMID_5 {
    public static void main(String[] args) {
        VMID vmid = new VMID();
        String vmidString = vmid.toString();
        System.out.println("VMID: " + vmidString);
    }
}
