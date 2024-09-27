import java.io.PushbackReader;
import java.io.StringReader;
import java.io.IOException;

public class PushbackReader_4 {
    public static void main(String[] args) {
        try {
            StringReader sr = new StringReader("Hello World!");
            PushbackReader pr = new PushbackReader(sr);

            int c;

            // read and print the first character
            c = pr.read();
            System.out.print((char) c);

            // unread the character 'W'
            pr.unread(c);

            // read and print the next character
            c = pr.read();
            System.out.print((char) c);

            // unread the character 'o'
            pr.unread(c);

            // read and print the next character
            c = pr.read();
            System.out.print((char) c);

            // unread the character 'r'
            pr.unread(c);

            // read and print the next character
            c = pr.read();
            System.out.print((char) c);

            // unread the character 'l'
            pr.unread(c);

            // read and print the next character
            c = pr.read();
            System.out.print((char) c);

            // unread the character 'd'
            pr.unread(c);

            // read and print the next character
            c = pr.read();
            System.out.print((char) c);

            // unread the character '!'
            pr.unread(c);

            // read and print the next character
            c = pr.read();
            System.out.print((char) c);

            // unread the character EOF
            pr.unread(c);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
