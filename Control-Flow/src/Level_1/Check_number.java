package Level_1;

import java.util.Scanner;

public class Check_number {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		
		if(n1==0) {
			System.out.println("Zero");
		}
		else if(n1>0){
			System.out.println("Positive");
		}
		else {
			System.out.println("Negative");
		}

	}

	
}
