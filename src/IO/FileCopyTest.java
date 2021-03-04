package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/7/2 16:58
 */
public class FileCopyTest {
    public static void main(String[] args) {
        File s = new File("e://c.txt");
        File g = new File("e://g.txt");
        copy(s,g);
    }

    public static void copy(File s, File g) {
        try {
            FileReader fileReader = new FileReader(s);
            FileWriter fileWriter = new FileWriter(g);
            int ch = 0;
            while ((ch = fileReader.read()) != -1) {
                fileWriter.write(ch);
            }
            fileReader.close();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
