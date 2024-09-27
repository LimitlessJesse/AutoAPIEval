import org.omg.CORBA.ParameterMode;

public class ParameterMode_2 {
    public static void main(String[] args) {
        int i = 1;
        ParameterMode mode = ParameterMode.from_int(i);
        System.out.println("ParameterMode: " + mode.toString());
    }
}
