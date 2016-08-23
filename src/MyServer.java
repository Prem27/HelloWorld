import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	public static void main(String[] args) throws IOException {
		
		
		
		ServerSocket ss = new ServerSocket(6666);
		Socket s = ss.accept();
		System.out.println(ss.accept());
//		if(ss.accept()==true){
			
	//	}
		DataInputStream din = new DataInputStream(s.getInputStream());
		String str = (String)din.readUTF();
		System.out.println("Message :"+str);
		ss.close();
		
	}
}
