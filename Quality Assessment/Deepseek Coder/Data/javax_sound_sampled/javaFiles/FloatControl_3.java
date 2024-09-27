import javax.sound.sampled.*;

public class FloatControl_3 {
    public static void main(String[] args) {
        try {
            // Create a new line
            Line line = new Line() {
                @Override
                public Type getType() {
                    return null;
                }

                @Override
                public Info getInfo() {
                    return null;
                }

                @Override
                public void open() throws LineUnavailableException {

                }

                @Override
                public void close() {

                }

                @Override
                public boolean isOpen() {
                    return false;
                }

                @Override
                public boolean isActive() {
                    return false;
                }

                @Override
                public boolean isStopped() {
                    return false;
                }

                @Override
                public boolean isClosed() {
                    return false;
                }
            };

            // Create a new FloatControl
            FloatControl floatControl = new FloatControl(FloatControl.Type.MASTER_GAIN, line) {
                @Override
                public float getValue() {
                    return 0;
                }

                @Override
                public void setValue(float value) {

                }

                @Override
                public float getMinimum() {
                    return -80;
                }

                @Override
                public float getMaximum() {
                    return 6;
                }

                @Override
                public float getNormalizedValue() {
                    return 0;
                }

                @Override
                public void setNormalizedValue(float value) {

                }
            };

            // Get the minimum value
            float min = floatControl.getMinimum();
            System.out.println("Minimum value: " + min);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
