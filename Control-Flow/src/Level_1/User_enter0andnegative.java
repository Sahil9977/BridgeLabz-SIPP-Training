package Level_1;

import java.util.Scanner;

public class User_enter0andnegative {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n ;
		n = sc.nextInt();
		double total =n;
		while(true) {
			n = sc.nextInt();
			if(n<=0) break;
			total+=n;
			
		}
		System.out.println(total);
	
	}

}
