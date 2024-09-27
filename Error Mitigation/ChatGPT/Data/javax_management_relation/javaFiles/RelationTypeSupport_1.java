import javax.management.relation.RelationTypeSupport;

public class RelationTypeSupport_1 {
    public static void main(String[] args) {
        RelationTypeSupport relationTypeSupport = new RelationTypeSupport("ExampleRelationType");
        String relationTypeName = relationTypeSupport.getRelationTypeName();
        System.out.println("Relation Type Name: " + relationTypeName);
    }
}
