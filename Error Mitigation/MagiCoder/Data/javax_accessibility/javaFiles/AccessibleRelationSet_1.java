import javax.accessibility.AccessibleRelation;
import javax.accessibility.AccessibleRelationSet;

public class AccessibleRelationSet_1 {
    public static void main(String[] args) {
        AccessibleRelationSet relationSet = new AccessibleRelationSet();
        AccessibleRelation relation = new AccessibleRelation();
        boolean result = relationSet.add(relation);
        System.out.println(result);
    }
}
