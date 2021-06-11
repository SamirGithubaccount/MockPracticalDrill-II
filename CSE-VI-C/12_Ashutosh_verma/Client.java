import java.io.*;
import java.net.*;
public class Client
{
    public static void main(String Args[])throws IOException
    {
        try{
            Socket s=new Socket("private ip address of server machine",1098);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello Server");
            dout.flush();
            dout.close();
            s.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}