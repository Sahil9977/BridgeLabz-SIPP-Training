package Level_1;

import java.util.Scanner;

public class Natural_num_with_for {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int withformula =( n*(n+1)) /2;
		int loop = 0;
		for(int i = 1;i<=n;i++) {
			loop+=i;
		}
		if(withformula == loop) System.out.println("From both method sum is same "+loop);
	}

}
