package Level_1;
import java.util.*;
public class First_num_isSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		if(n1<n2) {
			if(n1<n3) {
				System.out.println("Is the first number the smallest ?,Yes");
			}
			else {
				System.out.println("Is the first number the smallest ?,No");
			}
		}
		else {
			System.out.println("Is the first number the smallest ?,No");
		}
				
		

	}

}
