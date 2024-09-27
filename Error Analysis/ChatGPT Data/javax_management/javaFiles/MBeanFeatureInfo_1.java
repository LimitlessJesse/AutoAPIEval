import javax.management.MBeanFeatureInfo;

public class MBeanFeatureInfo_1 {
    public static void main(String[] args) {
        MBeanFeatureInfo info = new MBeanFeatureInfo("FeatureName", "Description", null);
        String description = info.getDescription();
        System.out.println(description);
    }
}
