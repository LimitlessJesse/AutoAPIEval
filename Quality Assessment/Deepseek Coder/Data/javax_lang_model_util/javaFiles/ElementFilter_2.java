import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.ElementFilter;
import java.util.List;

public class ElementFilter_2 {
    public static void main(String[] args) {
        List<TypeElement> typeElements = ElementFilter.typesIn(List.of(
                new Element() {
                    @Override
                    public Name getSimpleName() {
                        return Name.identifier("String");
                    }

                    @Override
                    public Kind getKind() {
                        return Kind.CLASS;
                    }

                    @Override
                    public TypeMirror asType() {
                        return null;
                    }

                    @Override
                    public List<? extends Element> getEnclosedElements() {
                        return null;
                    }

                    @Override
                    public Element getEnclosingElement() {
                        return null;
                    }

                    @Override
                    public List<? extends Element> getModifiers() {
                        return null;
                    }

                    @Override
                    public Object getUnderlyingElement() {
                        return null;
                    }

                    @Override
                    public void accept(ElementVisitor<? super Void, Void> v, Void p) {

                    }
                }
        ));

        System.out.println(typeElements);
    }
}
