import javax.management.DefaultLoaderRepository;

public class DefaultLoaderRepository_2 {
    public static void main(String[] args) {
        try {
            Class<?> loadedClass = DefaultLoaderRepository.loadClassWithout(ClassLoader.getSystemClassLoader(), "com.example.MyClass");
            System.out.println("Class loaded successfully: " + loadedClass.getName());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}
