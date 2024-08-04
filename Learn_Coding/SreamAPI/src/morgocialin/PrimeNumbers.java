package morgocialin;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class PrimeNumbers {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		
		List<Integer>alinus = al.stream().filter(num -> {
			int count = 0;
			for(int i = 0 ; i <= num ;i++)
			{
				if(i % 2 == 0)
					count++;
			}
			
			return count == 2;
		}).collect(Collectors.toList());
		
		alinus.forEach(System.out :: println);
	}
}
