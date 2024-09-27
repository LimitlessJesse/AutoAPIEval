import javax.management.openmbean.TabularDataSupport;

public class TabularDataSupport_5 {
    public static void main(String[] args) {
        TabularDataSupport tabularDataSupport = new TabularDataSupport();
        tabularDataSupport.put("key1", "value1");
        tabularDataSupport.put("key2", "value2");
        System.out.println(tabularDataSupport.size());
    }
}
