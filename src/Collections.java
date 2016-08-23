import java.util.ArrayList;
import java.util.Collection;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> array= new ArrayList();
		
		array.add("Prem");
		array.add("Siva");
		ArrayList<String> array1= new ArrayList();
		array1.add("Yesu");
		array1.add("Rohith");
		ArrayList<String> arrayAll= new ArrayList();
		arrayAll.addAll(array);
		arrayAll.addAll(array1);
		System.out.println(arrayAll);
		
		
		ArrayList<String> arraySub= new ArrayList(arrayAll.subList(0, 3));
		System.out.println(arraySub);
				
		if(arraySub.contains("Prem")|| arraySub.contains(("Rohith"))){
			System.out.println("Success....!");
		}
		else{
			System.out.println("Failed......!");
		}
		
		
		System.out.println(arraySub.indexOf("Prem"));
		
	}

}
