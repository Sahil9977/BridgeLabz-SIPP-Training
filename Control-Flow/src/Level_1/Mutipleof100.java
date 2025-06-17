package Level_1;

import java.util.Scanner;

public class Mutipleof100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=100;i>=1;i--) {
			if(i%n==0) {
				System.out.println(i);
			}
		}

	}

}
