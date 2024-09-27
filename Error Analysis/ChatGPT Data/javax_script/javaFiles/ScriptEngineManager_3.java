import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class ScriptEngineManager_3 {
    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByExtension("js");
        if(engine != null) {
            System.out.println("Successfully retrieved ScriptEngine for 'js' extension");
        } else {
            System.out.println("ScriptEngine not found for 'js' extension");
        }
    }
}
