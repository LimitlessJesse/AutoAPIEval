import javax.sql.StatementEvent;
import java.sql.SQLException;

public class StatementEvent_4 {
    public static void main(String[] args) {
        StatementEvent statementEvent = new StatementEvent(null, null);
        SQLException sqlException = statementEvent.getSQLException();
        System.out.println("SQL Exception: " + sqlException);
    }
}
