import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MouseMotionAdapter_2 {
    public static void main(String[] args) {
        MyMouseMotionAdapter adapter = new MyMouseMotionAdapter();
        adapter.mouseMoved(new MouseEvent(null, 0, 0, 0, 100, 200, 0, false));
    }

    static class MyMouseMotionAdapter extends MouseMotionAdapter {
        @Override
        public void mouseMoved(MouseEvent e) {
            System.out.println("Mouse moved to: (" + e.getX() + ", " + e.getY() + ")");
        }
    }
}
