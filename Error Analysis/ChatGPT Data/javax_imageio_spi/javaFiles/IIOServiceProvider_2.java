import javax.imageio.spi.IIOServiceProvider;
import java.util.Locale;

public class IIOServiceProvider_2 {
    public static void main(String[] args) {
        IIOServiceProvider provider = new IIOServiceProvider() {
            @Override
            public String getDescription(Locale locale) {
                // Implementation of getDescription method
                return "This is a sample IIOServiceProvider";
            }

            @Override
            public String getVendorName() {
                return null;
            }

            @Override
            public String getVersion() {
                return null;
            }

            @Override
            public String getVendorDescription() {
                return null;
            }

            @Override
            public String[] getExtraImageMetadataFormatNames() {
                return new String[0];
            }

            @Override
            public String[] getMIMETypes() {
                return new String[0];
            }

            @Override
            public boolean canUseCacheFile() {
                return false;
            }
        };

        Locale locale = Locale.getDefault();
        System.out.println(provider.getDescription(locale));
    }
}
