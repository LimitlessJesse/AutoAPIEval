import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class AtomicReferenceFieldUpdater_3 {
    public static void main(String[] args) {
        // Define a class with a volatile field
        class MyClass {
            volatile int field;
        }

        // Create an updater for the field
        AtomicReferenceFieldUpdater<MyClass, Integer> updater =
                AtomicReferenceFieldUpdater.newUpdater(MyClass.class, int.class, "field");

        // Create an instance of the class
        MyClass obj = new MyClass();

        // Set the field value
        updater.set(obj, 10);

        // Get the field value
        int value = updater.get(obj);

        // Print the value
        System.out.println("Value: " + value);
    }
}
