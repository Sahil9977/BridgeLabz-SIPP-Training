package Level_1;

import java.util.Scanner;

public class Check_Spring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day= sc.nextInt();
		
		if((month==3 && day >=20)|| (month ==4) || (month == 5) || (month ==6 && day <=20)) {
			System.out.println("Its a Spring Season");
		}
		else {
			System.out.println("Its not a Spring Season");
		}

	}

}
