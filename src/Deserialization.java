import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileInputStream File = new FileInputStream("Output.txt");
		ObjectInputStream Obj = new ObjectInputStream(File);
		Student s =(Student) Obj.readObject();
		System.out.println(s.name +" " +s.id);
		
		
	}

}
