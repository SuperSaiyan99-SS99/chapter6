package exercises;

import java.util.Scanner;

public class RightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		double c;
		double area;
		double perimeter;
		String answer;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Do you have a right triangle or type quit to quit?");
		answer = input.nextLine();
		while ("yes".equalsIgnoreCase(answer)) {
			System.out.println("Please enter the shortest side length.");
			a = input.nextDouble();
			System.out.println("Please enter the next shortest side length.");
			b = input.nextDouble();
			
			System.out.println("Do you have another right triangle or type quit to quit?");
		}
		if ("no".equalsIgnoreCase(answer) || "quit".equalsIgnoreCase(answer) || "stop".equalsIgnoreCase(answer)) {
			System.out.println("You have exited the program.");
		}
	}

}
