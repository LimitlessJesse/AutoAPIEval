import java.awt.List;

public class List_2 {
    public static void main(String[] args) {
        List awtList = new List();
        awtList.add("Apple");
        awtList.add("Banana");
        awtList.add("Orange");

        System.out.println("Before removing all elements: " + awtList);

        awtList.removeAll();

        System.out.println("After removing all elements: " + awtList);
    }
}
