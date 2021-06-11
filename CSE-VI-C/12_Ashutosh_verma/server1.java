import java.io.*;
import java.net.*;
public class server1{

 public static void main(string[] args){
    try{
    ServerSocket ss=new ServerSocket(8080);
    Server s=ss.accept();

    DataInputStrean din=new DataInputStream(s.getInputStream);

    String str=(String)dis.readBuffer();

    System.out.println("Message is"+str);
    ss.close()
    }catch exception(e)
        System.out.println(e);
}
}