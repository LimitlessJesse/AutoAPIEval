import org.omg.PortableServer.POAManagerPackage.State;

public class State_1 {
    public static void main(String[] args) {
        State state = State.ACTIVE;
        int stateValue = state.value();
        System.out.println("The integer value of the state is: " + stateValue);
    }
}
