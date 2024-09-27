public class Thread_2 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("This is a thread running");
    }
}
