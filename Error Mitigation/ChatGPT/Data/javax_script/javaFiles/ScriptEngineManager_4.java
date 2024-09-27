import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class ScriptEngineManager_4 {
    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByMimeType("text/javascript");
        
        if(engine != null) {
            System.out.println("ScriptEngine found for mime type: " + engine.getFactory().getEngineName());
        } else {
            System.out.println("ScriptEngine not found for the specified mime type.");
        }
    }
}
