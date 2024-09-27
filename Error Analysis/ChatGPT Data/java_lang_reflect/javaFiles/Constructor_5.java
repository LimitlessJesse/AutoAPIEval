import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;

public class Constructor_5 {
    public static void main(String[] args) {
        try {
            Class<?> myClass = Main.class;
            Constructor<?>[] constructors = myClass.getConstructors();
            
            for(Constructor<?> constructor : constructors){
                Class<?>[] exceptionTypes = constructor.getExceptionTypes();
                
                System.out.println("Constructor: " + constructor.getName());
                for(Class<?> exceptionType : exceptionTypes){
                    System.out.println("Exception type: " + exceptionType.getName());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
