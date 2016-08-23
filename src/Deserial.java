import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserial {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		FileInputStream file = new FileInputStream(new File( "Out.txt"));
		ObjectInputStream obj = new ObjectInputStream(file);
		Numbers n = (Numbers) obj.readObject();
		System.out.println(n);
	}

}
