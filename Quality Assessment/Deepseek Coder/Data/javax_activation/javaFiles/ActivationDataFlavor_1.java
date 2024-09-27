import javax.activation.ActivationDataFlavor;
import javax.activation.DataContentHandler;
import javax.activation.DataSource;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class ActivationDataFlavor_1 {
    public static void main(String[] args) {
        DataContentHandler dch = new DataContentHandler() {

            @Override
            public Object getContent(DataSource ds) throws IOException {
                return null;
            }

            @Override
            public Object getTransferData(DataFlavor df, DataSource ds) throws UnsupportedFlavorException, IOException {
                return null;
            }

            @Override
            public void writeTo(Object obj, DataFlavor df, OutputStream os) throws IOException {

            }

            @Override
            public DataContentHandler getDataContentHandler(DataFlavor df) {
                return null;
            }
        };

        ActivationDataFlavor adf = new ActivationDataFlavor(dch, "text/plain", "Plain Text");
        String mimeType = adf.getMimeType();
        System.out.println(mimeType);
    }
}
