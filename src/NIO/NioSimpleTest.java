package NIO;

import java.nio.ByteBuffer;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/7/3 12:49
 */
public class NioSimpleTest {
    public static void main(String[] args) {
        ByteBuffer byteBuffer=ByteBuffer.allocate(1024);
        byteBuffer.limit();
        System.out.println( byteBuffer.limit());
        byteBuffer.position();
        System.out.println( byteBuffer.position());
        System.out.println(byteBuffer.capacity());
        byteBuffer.put("1234".getBytes());
        byteBuffer.flip();
        byte[] bt=new byte[byteBuffer.limit()];
        byteBuffer.get(bt);
        System.out.println(new String(bt,0,bt.length));
    }
}
