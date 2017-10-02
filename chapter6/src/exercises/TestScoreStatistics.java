package exercises;

import java.util.Scanner;

public class TestScoreStatistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0;
		int total = 0;
		int highest;
		int lowest;
		final int MIN = 0;
		final int MAX = 100;
		final int QUIT = 999;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter quiz score or " + QUIT + " to quit >> ");
		score = input.nextInt();
		
		while(score != quit) {
			scores[count] = score;
			total += scores[count];
			++count;
			if(count == max)
				score = quit;
			else
				System.out.println("Enter next quiz score or " + QUIT + " to quit >> ");
				score = input.nextInt();
		}
		System.out.print("The scores enterd were: ");
		for(int x = 0; x < count; ++ x)
			System.out.println(scores[x] + " ");
		if(count != 0)
			System.out.println("\n The average is " + (total * 1) / count);
		else System.out.println("No scores entered");
	}

}
