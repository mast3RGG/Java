package morgocialin;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(6);
		al.add(5);
		
		List<Integer> oddList = new ArrayList<>();
		for(Integer i : al)
		{
			if(i % 2 == 0)
				oddList.add(i);
		}
		
		System.out.println(oddList);
		
		List<Integer> oddListApi = oddList.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.println(oddListApi);
		oddListApi.forEach(System.out::println);
		
		
		
		List<Integer> modifiedList = new ArrayList<>();
		for (Integer integer : al) {
			integer = integer *2;
			modifiedList.add(integer);
		}
		
		System.out.println(modifiedList);
		
		List <Integer> modifiedList2 = al.stream().map(obj -> obj * 2).collect(Collectors.toList());
		modifiedList.forEach(System.out :: println);
		System.out.println();
		Long count = al.stream().filter(i -> i % 2 == 0).count();
		System.out.println(count);
		System.out.println();
		Integer max = al.stream().max((i , j) -> i.compareTo(j)).get();
		System.out.println(max);
		
	}
}
