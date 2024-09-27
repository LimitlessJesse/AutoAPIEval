import javax.management.openmbean.TabularDataSupport;
import javax.management.openmbean.TabularType;

public class TabularDataSupport_17 {
    public static void main(String[] args) {
        TabularDataSupport tabularDataSupport = new TabularDataSupport();
        TabularType tabularType = tabularDataSupport.getTabularType();
        System.out.println(tabularType);
    }
}
