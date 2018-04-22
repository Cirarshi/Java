import java.net.*;
import java.io.*;
public class Server
{
public static void main(String[] args)
{
try
{
ServerSocket ss=new ServerSocket(4500);
System.out.println("trying to connect ");
Socket s=ss.accept();
DataInputStream di=new DataInputStream(s.getInputStream());
String str=(String)di.readUTF();
System.out.println("message recieved ="+ str);
DataOutputStream dataOut= new DataOutputStream(s.getOutputStream());
dataOut.writeUTF("you are connected..can send message");
ss.close();
}
catch(Exception e)
{
System.out.println("exception caught"+e);
}
}
}