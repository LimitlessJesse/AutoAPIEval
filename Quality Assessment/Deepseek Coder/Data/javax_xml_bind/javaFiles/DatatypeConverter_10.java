import javax.xml.bind.DatatypeConverter;

public class DatatypeConverter_10 {
    public static void main(String[] args) {
        String lexicalXSDTime = "12:30:30";
        System.out.println(DatatypeConverter.parseTime(lexicalXSDTime));
    }
}
