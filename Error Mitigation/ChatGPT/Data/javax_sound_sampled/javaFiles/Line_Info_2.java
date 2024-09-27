import javax.sound.sampled.Line;

public class Line_Info_2 {
    public static void main(String[] args) {
        Line.Info info1 = new Line.Info(Line.class);
        Line.Info info2 = new Line.Info(Line.class);
        
        boolean isMatching = info1.matches(info2);
        System.out.println("Is matching: " + isMatching);
    }
}
