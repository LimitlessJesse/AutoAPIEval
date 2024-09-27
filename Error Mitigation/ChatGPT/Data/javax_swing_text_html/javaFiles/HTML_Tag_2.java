import javax.swing.text.html.HTML;

public class HTML_Tag_2 {
    public static void main(String[] args) {
        HTML.Tag tag = HTML.Tag.BODY;
        boolean isBlock = tag.isBlock();
        System.out.println("Is " + tag + " a block tag? " + isBlock);
    }
}
