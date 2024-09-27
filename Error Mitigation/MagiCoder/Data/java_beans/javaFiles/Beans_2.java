import java.beans.Beans;

public class Beans_2 {
    public static void main(String[] args) {
        try {
            Beans.setDesignTime(true);
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }
}
