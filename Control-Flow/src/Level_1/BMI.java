package Level_1;
import java.util.*;
public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);
	        double weight = sc.nextDouble();     
	        double heightCm = sc.nextDouble();   
	        double heightM = heightCm / 100.0;
	        double bmi = weight / (heightM * heightM);

	        if (bmi <= 18.4) {
	            System.out.println("Underweight");
	        } else if (bmi <= 24.9) {
	            System.out.println("Normal");
	        } else if (bmi <= 39.9) {
	            System.out.println("Overweight");
	        } else {
	            System.out.println("Obese");
	        }

	}

}
