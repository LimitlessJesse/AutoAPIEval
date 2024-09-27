import javax.swing.filechooser.FileFilter;

public class FileFilter_2 {
    public static void main(String[] args) {
        FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.getName().toLowerCase().endsWith(".txt");
            }

            @Override
            public String getDescription() {
                return "Text files (*.txt)";
            }
        };

        System.out.println(fileFilter.getDescription());
    }
}
