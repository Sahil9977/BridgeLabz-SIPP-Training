package Level_1;
import java.util.*;
public class Mean_height {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] arr = new int[11];
		int sum =0;
		for(int i=0;i<11;i++) {
				arr[i]=sc.nextInt();
				sum += arr[i];
		}
		double Mean_Height= sum/11;
		System.out.println(Mean_Height);

	}

}
