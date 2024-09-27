import java.rmi.dgc.VMID;

public class VMID_4 {
    public static void main(String[] args) {
        VMID vmid = new VMID();
        int hashCode = vmid.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
