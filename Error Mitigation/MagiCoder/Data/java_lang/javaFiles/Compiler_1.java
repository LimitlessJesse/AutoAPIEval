import java.lang.Compiler;

public class Compiler_1 {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("YourClassName");
            boolean compiled = Compiler.compileClass(clazz);
            System.out.println("Compilation successful: " + compiled);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
