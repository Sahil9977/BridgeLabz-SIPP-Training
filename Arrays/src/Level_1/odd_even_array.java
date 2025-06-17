package Level_1;
import java.util.*;
public class odd_even_array {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		if(n<=0) {
			System.out.println("Error occured");
			return;
		}
		int t= (n/2)+1;
		int[] arr_odd= new int[t];
		int[] arr_even= new int[t];
		int Odd_index=0;
		int Even_index=0;
		for(int i=1;i<=n;i++) {
			if(i % 2==0) {
				arr_even[Even_index++]= i;
			}
			else {
				arr_odd[Odd_index++]=i;
			}
		}
		System.out.println("Odd Number");
		for(int i=0;i<Odd_index;i++) {
			System.out.print(arr_odd[i]);
		}
		System.out.println("\nEven Number");
		for(int i=0;i<Even_index;i++) {
			System.out.print(arr_even[i]);
		}
		
	}

}
