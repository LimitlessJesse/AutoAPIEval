import javax.tools.SimpleJavaFileObject;

public class SimpleJavaFileObject_4 {
    public static void main(String[] args) {
        SimpleJavaFileObject fileObject = new SimpleJavaFileObject(null) {
            @Override
            public boolean delete() {
                // Custom implementation for delete method
                System.out.println("File deleted successfully");
                return true;
            }
        };

        boolean isDeleted = fileObject.delete();
        System.out.println("Is file deleted? " + isDeleted);
    }
}
