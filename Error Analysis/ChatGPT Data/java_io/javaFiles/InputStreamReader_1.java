import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class InputStreamReader_1 {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try {
            System.out.println("Enter a number: ");
            int number = Integer.parseInt(br.readLine());
            System.out.println("You entered: " + number);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
