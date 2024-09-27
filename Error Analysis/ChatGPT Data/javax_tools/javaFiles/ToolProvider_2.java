import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class ToolProvider_2 {
    public static void main(String[] args) {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        System.out.println("JavaCompiler retrieved successfully: " + compiler);
    }
}
