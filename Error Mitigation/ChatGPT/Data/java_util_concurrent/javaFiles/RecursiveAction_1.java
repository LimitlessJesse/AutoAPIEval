import java.util.concurrent.RecursiveAction;

public class MyRecursiveAction extends RecursiveAction {
    
    @Override
    protected void compute() {
        // Perform the main computation here
        System.out.println("Computing...");
    }

    public static void main(String[] args) {
        MyRecursiveAction action = new MyRecursiveAction();
        action.fork();
        action.join();
    }
}
