import javax.lang.model.element.Element;
import javax.lang.model.element.VariableElement;
import javax.lang.model.util.ElementFilter;
import java.util.List;

public class ElementFilter_3 {
    public static void main(String[] args) {
        List<VariableElement> variableElements = ElementFilter.fieldsIn(List.of(
                new Element() {
                    @Override
                    public List<? extends Element> getEnclosedElements() {
                        return List.of(
                                new VariableElement() {
                                    @Override
                                    public String getSimpleName() {
                                        return "variable1";
                                    }
                                },
                                new VariableElement() {
                                    @Override
                                    public String getSimpleName() {
                                        return "variable2";
                                    }
                                }
                        );
                    }
                },
                new Element() {
                    @Override
                    public List<? extends Element> getEnclosedElements() {
                        return List.of(
                                new VariableElement() {
                                    @Override
                                    public String getSimpleName() {
                                        return "variable3";
                                    }
                                },
                                new VariableElement() {
                                    @Override
                                    public String getSimpleName() {
                                        return "variable4";
                                    }
                                }
                        );
                    }
                }
        ));

        for (VariableElement variableElement : variableElements) {
            System.out.println(variableElement.getSimpleName());
        }
    }
}
