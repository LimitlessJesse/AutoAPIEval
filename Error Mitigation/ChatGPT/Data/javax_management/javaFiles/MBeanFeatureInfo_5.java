import javax.management.MBeanFeatureInfo;

public class MBeanFeatureInfo_5 {
    public static void main(String[] args) {
        MBeanFeatureInfo mBeanFeatureInfo = new MBeanFeatureInfo("featureName", "featureDescription");
        int hashCode = mBeanFeatureInfo.hashCode();
        System.out.println("Hash code value: " + hashCode);
    }
}
