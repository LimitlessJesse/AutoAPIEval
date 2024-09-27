import javax.swing.plaf.basic.BasicProgressBarUI;

public class BasicProgressBarUI_1 {
    public static void main(String[] args) {
        BasicProgressBarUI progressBarUI = new BasicProgressBarUI();
        int animationIndex = progressBarUI.getAnimationIndex();
        System.out.println("Animation Index: " + animationIndex);
    }
}
