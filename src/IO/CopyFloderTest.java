package IO;

import java.io.*;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/7/2 17:32
 */
public class CopyFloderTest {
    public static void main(String[] args) {
        File file = new File("e:\\co");
        File outFile = new File("c:\\");

    }

    public void copyFloder(File srcFile, File outFile) {
        if (srcFile.isDirectory()) {
            File newFile = new File(outFile, srcFile.getName());
            newFile.mkdir();
            File[] files = srcFile.listFiles();
        } else {
            File newFile = new File(outFile, srcFile.getName());
            try {
                copyFile(srcFile, newFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//        if ()
    }

    public void copyFile(File srcFile, File outFile) throws IOException {
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(outFile));
        int len = 0;
        while ((len = inputStream.read()) != -1) {
            outputStream.write(len);
        }
        inputStream.close();
        outputStream.close();
    }
}
