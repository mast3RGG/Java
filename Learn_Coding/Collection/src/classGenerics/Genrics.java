package classGenerics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Genrics {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("morgoci");
		al.add("alin");
		al.add("adrian");
		String all = al.get(0);
		
		HashMap<Integer, Integer> hashmap = new HashMap<>();
        hashmap.put(1, 2);

        Set<Map.Entry<Integer, Integer>> entrySet = hashmap.entrySet();
	        Iterator<Map.Entry<Integer, Integer>> iterator = entrySet.iterator();
	        while (iterator.hasNext()) {
	            Map.Entry<Integer, Integer> entry = iterator.next();
	            int key = entry.getKey();
	            int value = entry.getValue();
	            System.out.println("Cheie: " + key + ", Valoare: " + value);
	        }
		}
}
