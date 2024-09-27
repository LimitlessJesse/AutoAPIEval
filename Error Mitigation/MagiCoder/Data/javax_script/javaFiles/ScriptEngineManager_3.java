import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class ScriptEngineManager_3 {
    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByExtension("js");
        if (engine!= null) {
            System.out.println("Engine found and ready to use!");
        } else {
            System.out.println("Engine not found!");
        }
    }
}
