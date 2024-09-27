import javax.accessibility.AccessibleRelation;
import javax.accessibility.AccessibleRelationSet;

public class AccessibleRelationSet_5 {
    public static void main(String[] args) {
        AccessibleRelationSet relationSet = new AccessibleRelationSet();
        AccessibleRelation relation = new AccessibleRelation();

        // Add a relation to the relation set
        relationSet.add(relation);

        // Check if the relation is in the relation set
        if (relationSet.contains(relation)) {
            System.out.println("Relation is in the relation set");
        }

        // Remove the relation from the relation set
        if (relationSet.remove(relation)) {
            System.out.println("Relation has been removed from the relation set");
        }
    }
}
