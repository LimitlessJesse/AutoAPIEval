import javax.management.openmbean.OpenType;

public class OpenType_5 {
    public static void main(String[] args) {
        OpenType openType1 = new OpenType() {
            @Override
            public boolean equals(Object obj) {
                // Custom implementation for comparing open type instances
                return super.equals(obj);
            }
        };

        OpenType openType2 = new OpenType() {
            @Override
            public boolean equals(Object obj) {
                // Custom implementation for comparing open type instances
                return super.equals(obj);
            }
        };

        System.out.println("Are openType1 and openType2 equal? " + openType1.equals(openType2));
    }
}
