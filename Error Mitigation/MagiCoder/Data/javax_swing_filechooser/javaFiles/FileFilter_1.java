import javax.swing.filechooser.FileFilter;
import java.io.File;

public class FileFilter_1 {
    public static void main(String[] args) {
        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                }
                String name = f.getName().toLowerCase();
                return name.endsWith(".txt");
            }

            @Override
            public String getDescription() {
                return "Text files (*.txt)";
            }
        };

        File file = new File("example.txt");
        if (filter.accept(file)) {
            System.out.println(file.getName() + " is accepted by the filter.");
        } else {
            System.out.println(file.getName() + " is not accepted by the filter.");
        }
    }
}
