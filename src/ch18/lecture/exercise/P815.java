import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class P815 {
    public static void main(String[] args) throws IOException {

        File dir = new File("temp/images");
        File file1 = new File("temp/file1.txt");
        File file2 = new File("temp/file2.txt");
        File file3 = new File("temp/file3.txt");

        if (!dir.exists()) {
            dir.mkdirs();
        }
        if (!file1.exists()) {
            file1.createNewFile();
        }
        if (!file2.exists()) {
            file2.createNewFile();
        }
        if (!file3.exists()) {
            file3.createNewFile();
        }

        File temp = new File("temp");
        File[] contents = temp.listFiles();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
        for (File file : contents) {
            System.out.printf("%-25s", sdf.format(new Date(file.lastModified())));
            if (file.isDirectory()) {
                System.out.printf("%-10s%-20s%n", "<DIR>", file.getName());
            } else {
                System.out.printf("%-10s%-20s%n", file.length(), file.getName());
            }
        }
    }
}
