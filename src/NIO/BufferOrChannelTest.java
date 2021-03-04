package NIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * 直接与非直接缓冲区文件复制
 *
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/7/3 16:13
 */
public class BufferOrChannelTest {
    public static void test1() throws IOException {
        long startTime = System.currentTimeMillis();
        FileChannel intChannel = FileChannel.open(Paths.get("e://zongjie.mp4"), StandardOpenOption.READ);
        FileChannel outChannel = FileChannel.open(Paths.get("e://zongjie1.mp4"), StandardOpenOption.READ, StandardOpenOption.WRITE, StandardOpenOption.CREATE);
        MappedByteBuffer inmap = intChannel.map(FileChannel.MapMode.READ_ONLY, 0, intChannel.size());
        MappedByteBuffer outmap = outChannel.map(FileChannel.MapMode.READ_WRITE, 0, intChannel.size());
        byte[] bt = new byte[inmap.limit()];
        inmap.get(bt);
        outmap.put(bt);
        outChannel.close();
        intChannel.close();
        long endTime = System.currentTimeMillis();
        System.out.println("内存加载文件所需时间：" + (endTime - startTime));
    }

    //利用通道完成数据复制(非直接缓冲区)
    public static void test() throws Exception {
        long startTime = System.currentTimeMillis();
        FileInputStream fileInputStream = new FileInputStream("e://zongjie.mp4");
        FileOutputStream fileOutputStream = new FileOutputStream("e://zongjie1.mp4");
        //获取通道
        FileChannel inChannel = fileInputStream.getChannel();
        FileChannel outChannel = fileOutputStream.getChannel();
        ByteBuffer buf = ByteBuffer.allocate(1024);
        while (inChannel.read(buf) != -1) {
            buf.flip();//切换到读取模式
            outChannel.write(buf);
            buf.clear();
        }
        fileInputStream.close();
        fileOutputStream.close();
        inChannel.close();
        outChannel.close();
        long endTime = System.currentTimeMillis();
        System.out.println("非缓存区：" + (endTime - startTime));
    }

    public static void main(String[] args) {
        try {
            test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
