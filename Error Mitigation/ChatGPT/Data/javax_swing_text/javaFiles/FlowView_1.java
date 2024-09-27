import javax.swing.text.FlowView;

public class FlowView_1 {
    public static void main(String[] args) {
        FlowView flowView = new FlowView();
        int index = 0;
        int flowSpan = flowView.getFlowSpan(index);
        System.out.println("Flow span for index " + index + ": " + flowSpan);
    }
}
