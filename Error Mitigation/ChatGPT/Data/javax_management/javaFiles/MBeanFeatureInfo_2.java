import javax.management.MBeanFeatureInfo;

public class MBeanFeatureInfo_2 {
    public static void main(String[] args) {
        MBeanFeatureInfo info = new MBeanFeatureInfo("FeatureName", "FeatureDescription");
        String name = info.getName();
        System.out.println("Feature Name: " + name);
    }
}
