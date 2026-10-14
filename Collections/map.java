// Map is a collection of a key and the corresponding valur pairs.
import java.util.*;
class map{
	public static void main(String[] args) {
		// It sort the values based on the key not on the value.
		Map<String,Integer> new_map = new TreeMap<>();

		new_map.put("Abhishek",56);
		new_map.put("Shashank",34);
		new_map.put("Manish",72);
		new_map.put("Ashish",72);
		new_map.put("Ansh",47);
		new_map.put("Ansh",49);
		System.out.println(new_map);
		// It doesnot sort the values.
		Map<String,Integer> new_map1 = new HashMap<>();

		new_map1.put("Abhishek",56);
		new_map1.put("Shashank",34);
		new_map1.put("Manish",72);
		new_map1.put("Ashish",72);
		new_map1.put("Ansh",47);
		new_map1.put("Ansh",49);
		//System.out.println(new_map1);

		// using the for-each loop
		for(String name : new_map1.keySet()){
			System.out.println(name+": "+ new_map1.get(name)+" ");
		}

		/**synchronized is a keyword that prevents multiple threads 
			from executing a specific block of code or method at the same time. 
			It acts as a locking mechanism to protect shared data from corruption, 
			a problem known as a race condition.**/

		// Hashtable is Synchronized ,Whereas HashMap is not.
	Map<String,Integer> new_map2 = new Hashtable<>();

		new_map2.put("Abhishek",5);
		new_map2.put("Shashank",3);
		new_map2.put("Manish",7);
		new_map2.put("Ashish",7);
		new_map2.put("Ansh",3);
		new_map2.put("Ansh",4);
		System.out.print(new_map2.keySet());
		 for(String name1 : new_map2.keySet()){
			System.out.println(name1+" "+ new_map2.get(name1)+" ");
	}

		
	}
}
