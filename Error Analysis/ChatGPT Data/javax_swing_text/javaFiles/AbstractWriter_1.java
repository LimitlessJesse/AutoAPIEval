import javax.swing.text.AbstractWriter;

public class AbstractWriter_1 {
    public static void main(String[] args) {
        char[] cbuf = {'H', 'e', 'l', 'l', 'o'};
        AbstractWriter writer = new AbstractWriter() {
            @Override
            public void write(char[] cbuf, int off, int len) {
                super.write(cbuf, off, len);
            }
        };
        writer.write(cbuf, 0, cbuf.length);
    }
}
