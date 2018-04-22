import java.net.*;
import java.io.*;
public class Datagram
{
public static void main(String args[])throws Exception
{
DatagramSocket ds= new DatagramSocket(505);
String str="Prudhvi krishna";
byte[] buff=new byte[300];
buff=str.getBytes();
try{
InetAddress ad=InetAddress.getByName(www.sun.com);
DatagramPacket dp=new DatagramPacket(buff,buff.length,ad,505);
ds.send(dp);
ds.close();
}
catch(UnknownHostException e)
{
System.out.println(e);
}
}
}