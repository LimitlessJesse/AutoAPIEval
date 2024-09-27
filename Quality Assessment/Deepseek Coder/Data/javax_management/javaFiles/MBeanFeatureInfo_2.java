import javax.management.MBeanFeatureInfo;

public class MBeanFeatureInfo_2 {
    public static void main(String[] args) {
        MBeanFeatureInfo featureInfo = new MBeanFeatureInfo("add", "boolean", "This method appends the specified element to the end of this list.", true, false, false, false, null);
        System.out.println(featureInfo.getDescription());
    }
}
