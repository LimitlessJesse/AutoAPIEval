import java.lang.reflect.Executable;

public class Executable_3 {
    public static void main(String[] args) {
        Executable executable = // obtain Executable object
        int parameterCount = executable.getParameterCount();
        System.out.println("Parameter count: " + parameterCount);
    }
}
