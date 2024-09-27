import javax.lang.model.type.IntersectionType;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.SimpleTypeVisitor8;

public class SimpleTypeVisitor8_3 {
    public static void main(String[] args) {
        IntersectionType intersectionType = ... ; // initialize intersection type

        SimpleTypeVisitor8<TypeMirror, IntersectionType> visitor = new SimpleTypeVisitor8<>() {
            @Override
            public TypeMirror visitIntersection(IntersectionType t, IntersectionType p) {
                // Add your implementation here
                return super.visitIntersection(t, p);
            }
        };

        TypeMirror result = visitor.visit(intersectionType, intersectionType);
        System.out.println(result);
    }
}
