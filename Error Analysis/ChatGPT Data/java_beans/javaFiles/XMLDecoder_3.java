import java.beans.ExceptionListener;
import java.beans.XMLDecoder;

public class XMLDecoder_3 {
    public static void main(String[] args) {
        XMLDecoder decoder = new XMLDecoder(); // Create a new XMLDecoder
        ExceptionListener listener = new MyExceptionListener();
        decoder.setExceptionListener(listener); // Set the ExceptionListener
    }

    static class MyExceptionListener implements ExceptionListener {
        @Override
        public void exceptionThrown(Exception e) {
            System.out.println("Exception thrown: " + e.getMessage());
        }
    }
}
