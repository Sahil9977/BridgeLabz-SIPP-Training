package Level_1;
import java.util.*;
public class FizzBuzz {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		String[] result = new String[n+1];
		for(int i=0;i<=n;i++) {
			if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                result[i] = "FizzBuzz";
            } else if (i % 3 == 0 && i != 0) {
                result[i] = "Fizz";
            } else if (i % 5 == 0 && i != 0) {
                result[i] = "Buzz";
            } else {
                result[i] = Integer.toString(i);
            }
		}
		for(int i=0;i<=n;i++) {
			System.out.println("Position for"+i+"="+result[i]);
		}

	}

}
