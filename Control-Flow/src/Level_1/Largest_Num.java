package Level_1;
import java.util.*;
public class Largest_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		if(n1 > n2) {
			if(n1>n3) {
				System.out.println("Is the first number the largest? Yes\r\n"
						+ "Is the second number the largest? No\r\n"
						+ "Is the third number the largest? No\r\n"
						+ "");
			}
			else if(n3>n2) {
				System.out.println("Is the first number the largest? No\r\n"
						+ "Is the second number the largest? No\r\n"
						+ "Is the third number the largest? Yes\r\n"
						+ "");
			}
			else {
				
			}
		}
		else if(n2>n3){
			System.out.println("Is the first number the largest? No\r\n"
					+ "Is the second number the largest? Yes\r\n"
					+ "Is the third number the largest? No\r\n"
					+ "");
			
		}
		else {}

	}

}
