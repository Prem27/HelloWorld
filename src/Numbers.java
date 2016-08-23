
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class Numbers implements Serializable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i=1;i<= 10;i++){
			arr.add(i);
		}
		int t=0,t1=0;
		for(int i=0;i< arr.size();i++){
			int Val=arr.get(i);
			t=t+Val;
		}
		int v=arr.indexOf(4);
		Random r = new Random();
		
		arr.remove(r.nextInt(arr.size()));
		for(int i=0;i< arr.size();i++){
			int Val=arr.get(i);
			t1=t1+Val;
		}
		System.out.println(arr+"\n"+ (t-t1));
		
	}

}
