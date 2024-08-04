package morgocialin;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx2 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("alin");
		al.add("maxim");
		al.add("aliona");
		al.add("adrian");
		al.add("lola");
		
		ArrayList<String> alUpperCase = new ArrayList<>();
		for(String s : al)
			alUpperCase.add(s.toUpperCase());
		
		System.out.println(alUpperCase);
		
		List<String> modifedList = al.stream().map(obj -> obj.toUpperCase()).collect(Collectors.toList());
		modifedList.forEach(System.out :: println);
		
		
	}
}
