import javax.sound.sampled.Mixer;

public class Mixer_Info_3 {
    public static void main(String[] args) {
        Mixer.Info mixerInfo = new Mixer.Info("VendorName", "Description", "Version");
        String vendor = mixerInfo.getVendor();
        System.out.println("Mixer Vendor: " + vendor);
    }
}
