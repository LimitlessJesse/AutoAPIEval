import javax.swing.filechooser.FileFilter;

public class FileFilter_1 {
    public static void main(String[] args) {
        FileFilter fileFilter = new FileFilter() {
            @Override
            public String getDescription() {
                return "JPG and GIF Images";
            }
        };
        
        System.out.println(fileFilter.getDescription());
    }
}
