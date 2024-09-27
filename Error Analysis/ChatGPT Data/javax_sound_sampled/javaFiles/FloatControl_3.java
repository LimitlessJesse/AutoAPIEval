import javax.sound.sampled.FloatControl;

public class FloatControl_3 {
    public static void main(String[] args) {
        FloatControl control = new FloatControl() {
            @Override
            public Type getType() {
                return null;
            }

            @Override
            public String getUnits() {
                return null;
            }

            @Override
            public float getMinimum() {
                return 0;
            }

            @Override
            public float getMaximum() {
                return 0;
            }

            @Override
            public float getPrecision() {
                return 0;
            }

            @Override
            public String[] getValues() {
                return new String[0];
            }

            @Override
            public float getDefaultValue() {
                return 0;
            }

            @Override
            public float getValue() {
                return 0;
            }

            @Override
            public void setValue(float value) {

            }

            @Override
            public Object getUserData() {
                return null;
            }

            @Override
            public void setUserDataType(Type dataType) {

            }
        };

        System.out.println("Units: " + control.getUnits());
    }
}
