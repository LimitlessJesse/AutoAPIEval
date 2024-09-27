import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class ScriptEngineManager_4 {
    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByMimeType("text/javascript");
        
        if (engine != null) {
            System.out.println("Found script engine for MIME type 'text/javascript'");
        } else {
            System.out.println("Script engine not found for MIME type 'text/javascript'");
        }
    }
}
