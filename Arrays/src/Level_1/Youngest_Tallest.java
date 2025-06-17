package Level_1;
import java.util.*;
public class Youngest_Tallest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String[] names= {"Amar","Akhbar","Anthony"};
		int[] ages= new int[3];
		double[] height= new double[3];
		for(int i=0;i<3;i++) {
			System.out.println("Enter the age of:"+names[i]);
			ages[i]= sc.nextInt();
			System.out.println("Enter the height of:"+names[i]);
			height[i]= sc.nextDouble();
			
		}
		int YoungestIndex=0;
		for(int i=0;i<3;i++) {
			if(ages[i]< ages[YoungestIndex]) {
				YoungestIndex=i;
			}
		}
		int TallestIndex=0;
		for(int i=0;i<3;i++) {
			if(height[i]>height[TallestIndex]) {
				TallestIndex=i;
			}
		}
		 System.out.println("\nYoungest friend is: " + names[YoungestIndex]);
	     System.out.println("Tallest friend is: " + names[TallestIndex]);
		

	}

}
