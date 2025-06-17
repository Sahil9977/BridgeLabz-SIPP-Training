package Level_1;

import java.util.Scanner;

public class Check_vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		
		if(n1>=18) {
			System.out.println("The person's age is "+n1+" and can vote.");
		}
		else {
			System.out.println("The person's age is "+n1+" and cannot vote.");
		}

	}

}
