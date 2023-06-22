import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberSeriesGenerator {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Value");
		int a=s.nextInt();
		List<Integer> series=generatenumberseries(a);
			System.out.println(series);
		}
		public static List<Integer> generatenumberseries(int a){
			List<Integer> series=new ArrayList<>();
			for(int i=1;i<=a;i+=2) {
				series.add(i);
			}
			return series;
		}
	}
