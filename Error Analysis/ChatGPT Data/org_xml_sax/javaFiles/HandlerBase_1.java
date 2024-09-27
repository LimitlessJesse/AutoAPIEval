import org.xml.sax.HandlerBase;

public class HandlerBase_1 {
    public static void main(String[] args) {
        char[] ch = {'a', 'b', 'c', 'd', 'e', 'f'};
        int start = 2;
        int length = 3;

        HandlerBase handler = new HandlerBase();
        handler.characters(ch, start, length);
    }
}
