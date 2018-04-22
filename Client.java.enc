import java.net.*;
import java.io.*;
public class Client
{
public static void main(String[] args)
{
try
{
Socket s=new Socket("localHost",4500);
DataOutputStream dataOut=new DataOutputStream(s.getOutputStream());
dataOut.writeUTF("hello ");
dataOut.close();
}
catch(Exception e)
{
System.out.println(e);
}
}}