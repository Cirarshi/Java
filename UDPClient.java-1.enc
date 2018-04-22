package udpclient;
import java.io.*;
import java.net.*;
public class UDPClient
{
public static void main(String[] args)throws Exception
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
DatagramSocket ds=new DatagramSocket();
InetAddress IPAddress=InetAddress.getByName("local host");
byte[] sendData=new byte[1024];
byte[] receiveData=new byte[1024];
System.out.println("hello--enter data");
String str=br.readLine();
sendData=str.getBytes();
DatagramPacket sendPacket=new DatagramPacket(sendData,sendData.length,IPAddress,9876);
ds.send(sendPacket);
DatagramPacket receivePacket=new DatagramPacket(receiveData,receiveData.length);
ds.receive(receivePacket);
String str1=new String(receivePacket.getData());
System.out.println("From server:"+str1);
ds.close();
}
}