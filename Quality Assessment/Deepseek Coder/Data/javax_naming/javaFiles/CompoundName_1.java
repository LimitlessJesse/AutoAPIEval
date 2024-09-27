import javax.naming.CompoundName;

public class CompoundName_1 {
    public static void main(String[] args) {
        CompoundName cn = new CompoundName("java.naming.CompoundName");
        String name = cn.get(2);
        System.out.println(name);
    }
}
