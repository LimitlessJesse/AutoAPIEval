import java.beans.XMLEncoder;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class XMLEncoder_1 {
    public static void main(String[] args) {
        try {
            XMLEncoder encoder = new XMLEncoder(new FileOutputStream("test.xml"));
            encoder.writeObject(new MyBean());
            encoder.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class MyBean {
    private String name;

    public MyBean() {
        this.name = "MyBean";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
