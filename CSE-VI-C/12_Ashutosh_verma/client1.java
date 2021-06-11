import java.io.*;
import java.ne.*;

public class client1{
    public static void main(String[] args) throws IOException{
        try{
        Server s=new Server("localhost",8080);

        DataOutputStream dout=new DataOutputStream(s.getOutputStream);

        dout.writeUTF("hello");
        dout.flush();
        dout.close();
        s.close();
    }catch Exception(e)
        System.out.println(e);
}
}