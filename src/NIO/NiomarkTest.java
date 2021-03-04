package NIO;

import java.nio.ByteBuffer;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/7/3 14:21
 */
public class NiomarkTest {
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        byteBuffer.put("abcd".getBytes());
        System.out.println(byteBuffer.position());
        byteBuffer.flip();

        byte[] bytes = new byte[byteBuffer.limit()];
        byteBuffer.get(bytes, 0, 2);
        System.out.println(byteBuffer.position());
        byteBuffer.mark();
        byteBuffer.get(bytes,2,2);
        System.out.println(byteBuffer.position());
        byteBuffer.reset();
        System.out.println(byteBuffer.position());
    }
}
