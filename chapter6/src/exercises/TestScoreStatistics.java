package exercises;

import java.util.Scanner;

public class TestScoreStatistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] scores = new int [];
		int score;
		int count = 0;
		int total = 0;
		int highest = 0;
		int lowest = 0;
		final int MIN = 0;
		final int MAX = 100;
		final int QUIT = 999;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter quiz score or " + QUIT + " to quit >> ");
		score = input.nextInt();
		
		while(score != QUIT) {
			if (MIN <= score <= MAX) {
				scores[count] = score;
				total += scores[count];
				if (scores[count] > highest) {
					highest = scores[count];
				}
				if (scores[count] < lowest) {
					lowest = scores[count];
				}
				++count;
				System.out.println("Enter next quiz score or " + QUIT + " to quit >> ");
				score = input.nextInt();
			}
			else {
				System.out.println("That score is no good.");
				System.out.println("Enter next quiz score or " + QUIT + " to quit >> ");
				score = input.nextInt();
			}
		}
		System.out.print("The scores enterd were: ");
		for(int x = 0; x < count; ++ x) {
			System.out.println(scores[x] + " ");
		}
		if(count != 0) {
			System.out.println("\n The average is " + (total * 1) / count);
			System.out.println("The highest is " + highest);
			System.out.println("The lowest is " + lowest);
		}
		else {
			System.out.println("No scores entered");
		}
	}

}
