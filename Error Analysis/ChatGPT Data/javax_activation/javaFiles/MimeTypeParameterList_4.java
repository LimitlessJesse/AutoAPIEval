import javax.activation.MimeTypeParameterList;

public class MimeTypeParameterList_4 {
    public static void main(String[] args) {
        MimeTypeParameterList list = new MimeTypeParameterList();
        list.add("charset", "UTF-8");
        list.add("type", "text/plain");
        System.out.println(list.size());
    }
}
