import java.beans.Encoder;
import java.beans.Statement;
import java.beans.XMLEncoder;

public class XMLEncoder_5 {
    public static void main(String[] args) {
        Encoder encoder = new XMLEncoder(System.out);
        Statement statement = new Statement("exampleObject", "exampleMethod", new Object[] { "arg1", "arg2" });
        
        encoder.writeStatement(statement);
        encoder.close();
    }
}
