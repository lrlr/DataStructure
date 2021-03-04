package SocketDemo;



import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by lirui on 2019/1/10.
 */
public class LengthCalculator extends Thread {
//以socket为成员变量
    private Socket socket;
    public LengthCalculator(Socket socket){
        this.socket=socket;
    }

    @Override
    public void run() {

        try {
            //获取socket输出流
            OutputStream outputStream = socket.getOutputStream();
            //获取socket输入流
            InputStream inputStream = socket.getInputStream();
            int ch=0;
            byte[] buff=new byte[1024];
            //buff主要用来读取输入的内容。存成byte数组，ch主要获取数组的二进制流
            ch= inputStream.read(buff);
            //将接受流的byte数组转换成字符串，这里获取的内容是客户端发过来的字符串
            String string = new String(buff, 0, ch);
            System.out.println(string);
            //往输出流里写入获得的字符串的长度，回发给客户端
            outputStream.write(String.valueOf(string.length()).getBytes());
            inputStream.close();
            outputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        super.run();
    }
}
