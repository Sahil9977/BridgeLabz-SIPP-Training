package Level_1;

import java.util.Scanner;

public class Factorial_using_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans=1;
		while(n!=0) {
			ans*=n;
			n--;
		}
		System.out.println(ans);
	}

}
