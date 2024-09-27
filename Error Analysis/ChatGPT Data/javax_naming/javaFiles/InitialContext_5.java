import javax.naming.InitialContext;

public class InitialContext_5 {
    public static void main(String[] args) {
        try {
            InitialContext ctx = new InitialContext();
            ctx.rename("oldName", "newName");
            System.out.println("Renaming successful.");
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
