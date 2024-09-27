import javax.management.MBeanFeatureInfo;

public class MBeanFeatureInfo_4 {
    public static void main(String[] args) {
        MBeanFeatureInfo info1 = new MBeanFeatureInfo("name1", "description1", null);
        MBeanFeatureInfo info2 = new MBeanFeatureInfo("name1", "description1", null);

        boolean result = info1.equals(info2);
        System.out.println("Are info1 and info2 equal? " + result);
    }
}
