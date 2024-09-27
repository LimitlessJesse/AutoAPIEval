import java.io.ObjectOutputStream;

public class ObjectOutputStream_PutField_5 {
    public static void main(String[] args) {
        try {
            ObjectOutputStream.PutField putField = new ObjectOutputStream.PutField() {
                @Override
                public void put(String name, float val) {
                    System.out.println("Putting value " + val + " into field " + name);
                }
            };
            
            putField.put("exampleField", 3.14f);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
