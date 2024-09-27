import javax.naming.spi.ResolveResult;

public class ResolveResult_1 {
    public static void main(String[] args) {
        ResolveResult resolveResult = new ResolveResult();
        Object resolvedObj = resolveResult.getResolvedObj();
        System.out.println("Resolved Object: " + resolvedObj);
    }
}
