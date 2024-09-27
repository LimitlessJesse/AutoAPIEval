import javax.naming.directory.SearchResult;
import javax.naming.NamingException;
import javax.naming.directory.Attributes;

public class SearchResult_1 {
    public static void main(String[] args) {
        SearchResult searchResult = new SearchResult("example", null, null);
        Attributes attributes = searchResult.getAttributes();
        System.out.println(attributes);
    }
}
