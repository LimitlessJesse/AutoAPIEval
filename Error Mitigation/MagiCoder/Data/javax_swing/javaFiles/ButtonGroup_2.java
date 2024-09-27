import javax.swing.*;

public class ButtonGroup_2 {
    public static void main(String[] args) {
        ButtonGroup bg = new ButtonGroup();
        JRadioButton rb1 = new JRadioButton("Button 1");
        JRadioButton rb2 = new JRadioButton("Button 2");
        bg.add(rb1);
        bg.add(rb2);
    }
}
