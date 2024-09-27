import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.util.ArrayList;

public class ScriptEngineManager_2 {
    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByExtension("JavaScript");

        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        System.out.println(list);
    }
}
