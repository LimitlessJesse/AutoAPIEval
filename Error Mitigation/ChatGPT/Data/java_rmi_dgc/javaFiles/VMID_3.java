import java.rmi.dgc.VMID;

public class VMID_3 {
    public static void main(String[] args) {
        VMID vmid = new VMID();
        int hashCode = vmid.hashCode();
        System.out.println("VMID Hash Code: " + hashCode);
    }
}
