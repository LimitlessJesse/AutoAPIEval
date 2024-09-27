import java.text.SimpleDateFormat;

public class SimpleDateFormat_3 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Default pattern: " + sdf.toPattern());
        
        sdf.applyPattern("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("Updated pattern: " + sdf.toPattern());
    }
}
