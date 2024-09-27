import org.omg.CORBA.TCKind;

public class TCKind_3 {
    public static void main(String[] args) {
        TCKind kind = TCKind.tk_long;
        int value = kind.value();
        System.out.println("The int value of TCKind is: " + value);
    }
}
