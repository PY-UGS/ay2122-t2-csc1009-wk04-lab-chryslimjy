package lab4;

import java.util.Scanner;

public class Calculate {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double weight;
		double height;
		
		System.out.println("Enter weight in pounds: ");
		weight = input.nextDouble();
		System.out.println("Enter height in inches: ");
		height = input.nextDouble();
		BMI calculate = new BMI(weight,height);
		
		System.out.println("BMI is: " + calculate.calculateBMI());
		System.out.println(calculate.interprete());
	}
}
