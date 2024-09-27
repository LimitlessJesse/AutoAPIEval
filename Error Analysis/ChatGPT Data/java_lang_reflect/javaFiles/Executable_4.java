import java.lang.reflect.Executable;

public class Executable_4 {
    public static void main(String[] args) {
        Executable executable = Main.class.getMethods()[0];
        boolean isVarArgs = executable.isVarArgs();
        System.out.println("Method is varargs: " + isVarArgs);
    }
}
