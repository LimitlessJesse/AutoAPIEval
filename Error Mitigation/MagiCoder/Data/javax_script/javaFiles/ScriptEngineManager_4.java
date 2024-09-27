import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class ScriptEngineManager_4 {
    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByMimeType("text/javascript");
        if (engine!= null) {
            System.out.println("Engine found for mime type: text/javascript");
        } else {
            System.out.println("No engine found for mime type: text/javascript");
        }
    }
}
