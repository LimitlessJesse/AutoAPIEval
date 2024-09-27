import org.omg.PortableServer.POAManagerPackage.State;

public class State_1 {
    public static void main(String[] args) {
        State state = new State();
        int value = state.value();
        System.out.println("Value: " + value);
    }
}
