import org.omg.DynamicAny._DynSequenceStub;

public class _DynSequenceStub_2 {
    public static void main(String[] args) {
        _DynSequenceStub dynSequence = new _DynSequenceStub();
        
        try {
            dynSequence.set_length(5);
        } catch (InvalidValue e) {
            System.out.println("InvalidValue: " + e.getMessage());
        }
    }
}
