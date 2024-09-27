public class Object_4 {
    public static void main(String[] args) {
        Object obj = new Object();
        Class<?> objClass = obj.getClass();
        System.out.println("Class of obj: " + objClass.getName());
    }
}
