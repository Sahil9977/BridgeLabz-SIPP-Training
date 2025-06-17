package Level_1;

import java.util.Scanner;

public class Sum_of_Natural_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		
		if(n1>0) {
			int sum = (n1*(n1 +1))/2;
			System.out.println("The sum of "+n1+"natural numbers is "+sum);
		}
		else {
			System.out.println("The number "+n1+" is not a natural number");
		}

	}

}
