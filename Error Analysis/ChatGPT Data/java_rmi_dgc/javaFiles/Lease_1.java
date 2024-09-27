import java.rmi.dgc.Lease;

public class Lease_1 {
    public static void main(String[] args) {
        Lease lease = new Lease();
        long value = lease.getValue();
        System.out.println("Value of Lease: " + value);
    }
}
