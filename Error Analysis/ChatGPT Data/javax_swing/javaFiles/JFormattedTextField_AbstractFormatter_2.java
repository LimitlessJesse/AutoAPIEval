import javax.swing.JFormattedTextField;

public class JFormattedTextField_AbstractFormatter_2 {
    public static void main(String[] args) {
        JFormattedTextField.AbstractFormatter formatter = new JFormattedTextField.AbstractFormatter() {
            @Override
            public Object stringToValue(String text) throws java.text.ParseException {
                return null;
            }

            @Override
            public String valueToString(Object value) throws java.text.ParseException {
                return value.toString();
            }
        };

        try {
            String stringValue = (String) formatter.valueToString("123");
            System.out.println(stringValue);
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
    }
}
