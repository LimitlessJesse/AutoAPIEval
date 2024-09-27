import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class Executable_10 {
    public static void main(String[] args) throws Exception {
        Method method = Executable_10.class.getMethod("getGenericExceptionTypes");
        Type[] exceptionTypes = method.getGenericExceptionTypes();

        for (Type exceptionType : exceptionTypes) {
            System.out.println(exceptionType);
        }
    }

    public static void getGenericExceptionTypes() throws Exception {
        throw new Exception("This is a test exception");
    }
}
