import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Socket s = new Socket("localhost",6666);
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		dout.writeUTF("Hello");
		dout.flush();
		s.close();
		
	}

}
