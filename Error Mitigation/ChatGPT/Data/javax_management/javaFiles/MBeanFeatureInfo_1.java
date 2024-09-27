import javax.management.MBeanFeatureInfo;

public class MBeanFeatureInfo_1 {
    public static void main(String[] args) {
        MBeanFeatureInfo info = new MBeanFeatureInfo("FeatureName", "FeatureDescription");
        String description = info.getDescription();
        System.out.println("Description: " + description);
    }
}
