import javax.management.openmbean.TabularDataSupport;

public class TabularDataSupport_4 {
    public static void main(String[] args) {
        TabularDataSupport tabularData = new TabularDataSupport();
        boolean isEmpty = tabularData.isEmpty();
        System.out.println("Is tabular data empty: " + isEmpty);
    }
}
