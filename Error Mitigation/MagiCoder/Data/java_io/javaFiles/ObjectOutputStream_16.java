import java.io.*;

public class ObjectOutputStream_16 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOut = new FileOutputStream("file.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(new MyClass());
        out.close();
        fileOut.close();
    }
}

class MyClass implements Serializable {
    private int id;
    private String name;

    public MyClass() {
        this.id = 1;
        this.name = "MyClass";
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeInt(id);
        out.writeObject(name);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        id = in.readInt();
        name = (String) in.readObject();
    }
}
