package Level_1;
import java.util.*;
public class Multiplication_of_a_number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr = new int[11];
		for(int i=1;i<=10;i++) {
				arr[i]=n*i;
				System.out.println(n+"*"+i+":"+ arr[i]);
		}
		
	}

}
