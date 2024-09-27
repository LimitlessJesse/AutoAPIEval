import java.beans.Beans;

public class Beans_1 {
    public static void main(String[] args) {
        boolean isDesignTime = Beans.isDesignTime();
        System.out.println("Is design time: " + isDesignTime);
    }
}
