import org.omg.CORBA.TypeCode;
import org.omg.CORBA.UnknownUserExceptionHelper;

public class UnknownUserExceptionHelper_5 {
    public static void main(String[] args) {
        TypeCode typeCode = UnknownUserExceptionHelper.type();
        System.out.println("TypeCode: " + typeCode);
    }
}
