package SocketDemo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by lirui on 2019/1/10.
 */
public class UDPServer {
    public static void main(String[] args) throws Exception{
        //服务端接收客户端发送的数据报
        DatagramSocket socket=new DatagramSocket(6800);//监听的端口号
        byte[] bytes = new byte[100];//存储从客户端接收到的数据
        DatagramPacket packet=new DatagramPacket(bytes,bytes.length);
        //接收客户端发送过来的内容，并将内容封装进DatagramPacket对象中
        socket.receive(packet);
        byte[] data = packet.getData();//从DatagramPacket对象中获取到真正存储的数据
        //将数据从二进制转换成字符串形式
        String content=new String(data,0,packet.getLength());
        System.out.println(content);
        //将要发送给客户端的数据转换成二进制
        byte[] sendContent=String.valueOf(content.length()).getBytes();
        //服务端给客户端发送数据报
        //从DatagramPacket对象中获取到数据的来源地址与端口号
        DatagramPacket packet1 = new DatagramPacket(sendContent, sendContent.length, packet.getAddress(), packet.getPort());
        socket.send(packet1);
    }

}
