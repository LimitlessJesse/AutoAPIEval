import javax.management.MBeanFeatureInfo;

public class MBeanFeatureInfo_1 {
    public static void main(String[] args) {
        MBeanFeatureInfo featureInfo = new MBeanFeatureInfo("getName", "java.lang.String", "The name of the feature", true, false, false, false, null, null, null, null);
        String name = featureInfo.getName();
        System.out.println("The name of the feature is: " + name);
    }
}
