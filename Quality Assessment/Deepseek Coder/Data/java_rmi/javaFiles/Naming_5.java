import java.rmi.Naming;

public class Naming_5 {
    public static void main(String[] args) {
        try {
            String url = "rmi://localhost:1099/MyServer";
            String[] list = (String[]) Naming.lookup(url);
            for (String s : list) {
                System.out.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
