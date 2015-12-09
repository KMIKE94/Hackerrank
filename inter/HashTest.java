import java.util.*;

public class HashTest{
	public static void main(String args[]){
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		//HashTable<Integer, String> ht = new HashTable<Integer, String>();
		HashSet<String> hs = new HashSet<String>();

		hm.put(1, "Hi");
		hm.put(2, "GoodBye");
		hm.put(3, "Hi");

		//ht.put(1, "Hi");
		//ht.put(2, "GoodBye");

		hs.add("Hi");
		hs.add("Goodbye");
		hs.add("Hi");

		Iterator it = hm.entrySet().iterator();
		//Iterator htit = ht.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry pair = (Map.Entry)it.next();
			//Map.Entry htpair = (Map.Entry)htit.next();
			System.out.println(pair.getValue());
		}

		System.exit(0);

	}
}