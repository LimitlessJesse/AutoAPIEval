import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class ScriptEngineManager_1 {
    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        
        if(engine != null) {
            System.out.println("ScriptEngine found: " + engine);
        } else {
            System.out.println("ScriptEngine not found");
        }
    }
}
