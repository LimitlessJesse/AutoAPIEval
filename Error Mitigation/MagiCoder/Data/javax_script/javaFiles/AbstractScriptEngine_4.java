import javax.script.AbstractScriptEngine;
import javax.script.ScriptException;
import java.io.Reader;
import java.io.StringReader;

public class AbstractScriptEngine_4 {
    public static void main(String[] args) {
        AbstractScriptEngine engine = new AbstractScriptEngine() {
            @Override
            public Object eval(Reader reader) throws ScriptException {
                return null;
            }
        };

        String script = "1 + 2";
        try (Reader reader = new StringReader(script)) {
            Object result = engine.eval(reader);
            System.out.println(result);
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}
