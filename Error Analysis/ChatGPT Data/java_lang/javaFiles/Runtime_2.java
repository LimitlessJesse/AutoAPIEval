import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Runtime_2 {
    public static void main(String[] args) {
        try {
            Process process = Runtime.getRuntime().exec(new String[]{"ls", "-l"});
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
