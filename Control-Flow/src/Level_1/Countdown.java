package Level_1;

import java.util.Scanner;

public class Countdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int counter = sc.nextInt();
		while(counter >0) {
			System.out.println(counter);
			counter--;
		}
	}

}
