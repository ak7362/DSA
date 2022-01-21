package week41;
import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Hash_map {

	public static void main(String[] args) {
		
		HashMap<String,String> h1=new HashMap<String,String>();
		

		h1.put("Ashish", "20/2/2020");
		h1.put("Alok", "21/2/2020");
		h1.put("rahul", "22/2/2020");
		h1.put("ranjan", "23/2/2020");
		h1.put("raghvir", "20/2/2020");
		h1.put("pawandeep", "20/2/2020");
		
		
//			h1.entrySet().forEach(System.out:: println);
//		System.out.println(Arrays.asList(h1));
		
		System.out.println(h1);
		
//		for(java.util.Map.Entry<String, String> entry :h1.entrySet()) {
//			System.out.print("Name: "+entry.getKey()+" "+ "Age: "+entry.getValue()+" ");
//		}
 
		
//		ArrayList<String> h1=new ArrayList<String>();
//		h1.add("Ashish");
//		h1.add("Ashish");
//		h1.add("Ashish");
//		System.out.print(h1);
//		for(String name:h1) {
//			System.out.print(h1+" ");
//		}
//		for(int i=0;i<h1.size();i++) {
//			System.out.print(h1.get(i)+" ");
//		}
	}

}
