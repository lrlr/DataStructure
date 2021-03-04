package SocketDemo;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by lirui on 2019/1/10.
 */
public class TCPClient {
    public static void main(String[] args)throws Exception {
        //创建socket,并指定连接的是本机的端口号为6900的服务器socket
        Socket socket=new Socket("127.0.0.1",6900);
        //获取输出流
        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();
        //将传递给server的字符串参数换成byte数组，并数组写入到输出流
        outputStream.write(new String("hello world").getBytes());
        int ch=0;
        byte[] bytes = new byte[1024];
        //buff主要用来读取输入的内容，存成byte数组，ch主要用来获取数组的长度
        ch=inputStream.read(bytes);
        //将接收流的Byte数组转换成字符串，这里是从服务端回发回来的字符串参数的长度
        String content=new String(bytes,0,ch);
        System.out.println(content);
        inputStream.close();
        outputStream.close();
        socket.close();
    }
}
