import java.rmi.Naming;

public class Naming_3 {
    public static void main(String[] args) {
        try {
            String[] remoteList = Naming.list("rmi://localhost:1099/HelloServer");
            for (String name : remoteList) {
                System.out.println(name);
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
