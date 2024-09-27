import javax.management.modelmbean.ModelMBeanNotificationInfo;

public class ModelMBeanNotificationInfo_4 {
    public static void main(String[] args) {
        ModelMBeanNotificationInfo notificationInfo = new ModelMBeanNotificationInfo();
        String descriptor = notificationInfo.getDescriptor();
        System.out.println("Notification Descriptor: " + descriptor);
    }
}
