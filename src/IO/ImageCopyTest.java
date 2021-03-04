package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/7/2 16:36
 */
public class ImageCopyTest {
    public static void main(String[] args) {
        File aFile = new File("C:\\Users\\63024\\Desktop\\123.png");
        File bFile = new File("E:\\c.png");
        try {
            copy(aFile,bFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
  public static void copy(File aFile, File bFile) throws Exception {
      FileInputStream fileInputStream=new FileInputStream(aFile);
      FileOutputStream fileOutputStream=new FileOutputStream(bFile);
      int by=0;
      while ((by=fileInputStream.read())!=-1){
          fileOutputStream.write(by);
      }
      fileInputStream.close();
      fileOutputStream.close();
  }
    public static void copy1(File aFile, File bFile) throws Exception {
        FileInputStream fileInputStream=new FileInputStream(aFile);
        FileOutputStream fileOutputStream=new FileOutputStream(bFile);
        byte[] bt=new byte[1024];
        int len=0;
        while ((len=fileInputStream.read(bt))!=-1){
            fileOutputStream.write(bt,0,len);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
