import javax.activation.MimetypesFileTypeMap;

public class MimetypesFileTypeMap_3 {
    public static void main(String[] args) {
        MimetypesFileTypeMap mimeTypesMap = new MimetypesFileTypeMap();
        mimeTypesMap.addMimeTypes("application/vnd.mspowerpoint97");
        System.out.println(mimeTypesMap);
    }
}
