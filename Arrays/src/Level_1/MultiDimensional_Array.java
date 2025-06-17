package Level_1;
import java.util.*;
public class MultiDimensional_Array {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows = sc.nextInt();
		System.out.println("Enter the number of column");
		int column = sc.nextInt();
		//create 2d array
		int [][] matrix = new int[rows][column];
		System.out.println("Enter the element of matrix");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<column;j++) {
					matrix[i][j] = sc.nextInt();
			}
		}
		//create 1d array
		int[] array = new int[rows*column];
		int index =0;
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<column;j++) {
				array[index]= matrix[i][j];
				index++;
			}
		}
		
		System.out.println("1d array");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}

	}

}
