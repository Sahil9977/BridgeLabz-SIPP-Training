package Level_1;
import java.util.*;
public class Total_sum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double[] arr= new double[10];
		double sum =0.0;
		int index=0;
		while(true) {
			System.out.println("Enter a number (0 or negative to stop):");
			double num = sc.nextDouble();
			if(num <=0) {
				break;
			}
			if(index>=10) {
				System.out.println("Maximum of 10 number reached");
				break;
			}
			arr[index]=num;
			index++;;
		}
		 System.out.println("\nStored Numbers:");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Number " + (i + 1) + ": " + arr[i]);
            sum += arr[i];
		}
		System.out.println("\ntotal sum is:"+sum);

	}

}
