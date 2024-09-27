import java.text.FieldPosition;

public class FieldPosition_5 {
    public static void main(String[] args) {
        FieldPosition fieldPosition = new FieldPosition(0);
        String sampleString = "Java is fun!";
        StringBuffer stringBuffer = new StringBuffer();

        String result = fieldPosition.toString(sampleString, stringBuffer);
        System.out.println(result);
    }
}
