package Level_1;

import java.util.Scanner;

public class Countdown_with_for {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int counter = sc.nextInt();
		for(int i=counter;i>0;i--) {
			System.out.println(i);
		}
	}
}
