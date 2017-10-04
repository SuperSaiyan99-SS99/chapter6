package exercises;

import java.util.Scanner;
import java.text.DecimalFormat;

public class RightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double a2;
		double b;
		double b2;
		double c;
		double c2;
		double area;
		double perimeter;
		String answer;
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Do you have a right triangle or type quit to quit?");
		answer = input.nextLine();
		while ("yes".equalsIgnoreCase(answer)) {
			System.out.println("Please enter the shortest side length.");
			a = input.nextDouble();
			System.out.println("Please enter the next shortest side length.");
			b = input.nextDouble();
			a2 = a * a;
			b2 = b * b;
			c2 = a2 + b2;
			c = Math.sqrt(c2);
			area = a * b / 2;
			perimeter = a + b + c;
			System.out.println("C = " + (df.format(c)) + " Area = " + (df.format(area)) +
					   " Perimeter = " + (df.format(perimeter)));
			System.out.println("Do you have another right triangle or type quit or stop to quit?");
		}
		if ("no".equalsIgnoreCase(answer) || "quit".equalsIgnoreCase(answer) || "stop".equalsIgnoreCase(answer)) {
			System.out.println("You have exited the program.");
		}
	}

}
