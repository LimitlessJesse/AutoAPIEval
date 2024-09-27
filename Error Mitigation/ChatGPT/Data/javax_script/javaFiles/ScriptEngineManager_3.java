import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class ScriptEngineManager_3 {
    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByExtension("js");
        
        if (engine != null) {
            System.out.println("ScriptEngine found for extension 'js': " + engine);
        } else {
            System.out.println("ScriptEngine not found for extension 'js'");
        }
    }
}
