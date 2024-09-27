import javax.script.ScriptEngineManager;
import javax.script.ScriptEngineFactory;
import java.util.List;

public class ScriptEngineManager_2 {
    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        List<ScriptEngineFactory> engineFactories = manager.getEngineFactories();
        
        for (ScriptEngineFactory factory : engineFactories) {
            System.out.println(factory.getEngineName());
        }
    }
}
