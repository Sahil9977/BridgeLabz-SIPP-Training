package Level_1;
import java.util.*;
public class YoungestTallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);
	        int[] ages = new int[3];
	        int[] heights = new int[3];

	        for (int i = 0; i < 3; i++) {
	            ages[i] = sc.nextInt();
	            heights[i] = sc.nextInt();
	        }

	        int youngest = Math.min(ages[0], Math.min(ages[1], ages[2]));
	        int tallest = Math.max(heights[0], Math.max(heights[1], heights[2]));

	        System.out.println("Youngest age: " + youngest);
	        System.out.println("Tallest height: " + tallest);
	}

}
