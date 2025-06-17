package Level_1;
import java.util.*;
public class Natural_num_with_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int withformula =( n*(n+1)) /2;
		int loop = 0;
		while(n!=0) {
			loop+=n;
			n--;
		}
		if(withformula == loop) System.out.println("From both method sum is same "+loop);
	}

}
