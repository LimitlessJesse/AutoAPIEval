import java.util.AbstractSet;

public class AbstractSet_2 {
    public static void main(String[] args) {
        // Creating an AbstractSet
        AbstractSet<Integer> set1 = new AbstractSet<Integer>() {
            // Implementing equals method
            public boolean equals(Object o) {
                // Custom logic to compare AbstractSet objects
                if (this == o) {
                    return true;
                }
                if (o == null || getClass() != o.getClass()) {
                    return false;
                }

                AbstractSet<?> set = (AbstractSet<?>) o;

                // Custom logic to compare elements in the set
                return this.size() == set.size() && this.containsAll(set);
            }
        };

        AbstractSet<Integer> set2 = new AbstractSet<Integer>() {
            // Implementing equals method
            public boolean equals(Object o) {
                // Custom logic to compare AbstractSet objects
                if (this == o) {
                    return true;
                }
                if (o == null || getClass() != o.getClass()) {
                    return false;
                }

                AbstractSet<?> set = (AbstractSet<?>) o;

                // Custom logic to compare elements in the set
                return this.size() == set.size() && this.containsAll(set);
            }
        };

        // Adding elements to the sets
        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(1);
        set2.add(2);
        set2.add(3);

        // Comparing the sets using equals method
        System.out.println(set1.equals(set2)); // Output: true
    }
}
