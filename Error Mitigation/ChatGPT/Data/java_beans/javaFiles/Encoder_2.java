import java.beans.Encoder;
import java.beans.Statement;

public class Encoder_2 {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();
        Statement statement = new Statement("exampleObject", "exampleMethod", new Object[]{"arg1", "arg2"});
        encoder.writeStatement(statement);
    }
}
