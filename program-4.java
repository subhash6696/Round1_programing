import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultipleCount {
	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9);
		Map<Integer,Integer> countMap=new HashMap<>();
		for(int i=1;i<=9;i++)//Initialize count map
		{
			countMap.put(i, 0);
		}
		for(int number :numbers) {
			for(int i=1;i<=9;i++) {
				if(number%i==0) {
					countMap.put(i, countMap.get(i)+1);
				}
			}
		}
System.out.println(countMap);
	}
}
