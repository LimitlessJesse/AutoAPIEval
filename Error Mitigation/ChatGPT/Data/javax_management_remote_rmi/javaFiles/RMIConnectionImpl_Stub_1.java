import javax.management.remote.rmi.RMIConnectionImpl_Stub;

public class RMIConnectionImpl_Stub_1 {
    public static void main(String[] args) {
        RMIConnectionImpl_Stub stub = new RMIConnectionImpl_Stub();
        try {
            stub.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
