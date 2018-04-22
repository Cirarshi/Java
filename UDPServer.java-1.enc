package udpserver;
import java.io.*;
import java.net.*;
public class UDPServer
{
public static void main(String[] args)throws Exception
{
DatagramSocket ds=new DatagramSocket(9876);
byte[] receiveData=new byte[1024];
byte[] sendData=new byte[1024];
System.out.println("server started");
DatagramPacket receivePacket=new DatagramPacket(receiveData,receiveData.length);
ds.receive(receivePacket);
String str=new String(receivePacket.getData());
System.out.println("Recieved data"+str);
InetAddress IPAddress=receivePacket.getAddress();
int port=receivePacket.getPort();
String str1=str.toUpperCase();
sendData=str1.getBytes();
DatagramPacket sendPacket=new DatagramPacket(sendData,sendData.length,IPAddress,port);
ds.send(sendPacket);
}
} 