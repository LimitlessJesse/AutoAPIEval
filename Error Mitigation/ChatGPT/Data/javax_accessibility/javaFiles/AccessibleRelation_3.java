import javax.accessibility.AccessibleRelation;

public class AccessibleRelation_3 {
    public static void main(String[] args) {
        AccessibleRelation relation = new AccessibleRelation();
        String key = relation.getKey();
        System.out.println("Key for this relation: " + key);
    }
}
