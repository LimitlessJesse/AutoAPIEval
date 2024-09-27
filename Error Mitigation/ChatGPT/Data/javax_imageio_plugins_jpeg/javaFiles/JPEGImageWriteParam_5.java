import javax.imageio.plugins.jpeg.JPEGImageWriteParam;

public class JPEGImageWriteParam_5 {
    public static void main(String[] args) {
        JPEGImageWriteParam param = new JPEGImageWriteParam(null);
        boolean tablesSet = param.areTablesSet();
        System.out.println("Are tables set? " + tablesSet);
    }
}
