import javax.management.QueryEval;
import javax.management.MBeanServer;

public class QueryEval_2 {
    public static void main(String[] args) {
        QueryEval queryEval = new QueryEval();
        MBeanServer server = // initialize MBeanServer here
        queryEval.setMBeanServer(server);
    }
}
