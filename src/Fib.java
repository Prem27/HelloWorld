import java.util.ArrayList;
import java.util.TreeSet;

public class Fib  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ArrayList<Integer> arr = new ArrayList<Integer>();
		
		int n,f=0, s=1;
		for(int i=0;i<=10;i++){
			if(i<=1){
				n=i;
			}else{
				n=f+s;
				f=s;
				s=n;
			}
			System.out.print("\t"+n);
			arr.add(n);
		}
		if(arr.get(arr.size()-1)/100 < 0.99){
			System.out.println("\n2 Digits");
		}
		
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(-1);
		tree.add(0);
		tree.add(9);
		tree.add(3);
		
		System.out.println(tree);
		
	}

	

	

}
