package program;

import java.util.Scanner;

public class Intro {
//Michael
	public static void greeting()
	{
		Scanner userInput = new Scanner (System.in);
		
		System.out.println("Hello, Welcome to Candyland. ");
		System.out.println("Player 1, What is your name?");
		
		String name1 = userInput.nextLine();
		
		System.out.println("Player 2, What is your name?");
		String name2 = userInput.nextLine();
		System.out.println("Player 3, What is your name?");
		String name3 = userInput.nextLine();
		System.out.println("Player 4, What is your name?");
		String name4 = userInput.nextLine();
		System.out.println("Hello " + name1 + ", "+  name2 + ", " + name3 + ", "  + name4 + ". Welcome to Candyland once again.");
		
		System.out.println("Would you like the rules?(yes or no)");
		
		String rules = userInput.nextLine();
		if( rules.equals("yes"))
		{
			System.out.println("Here are the rules");
			System.out.println("");
			System.out.println("Rule1: There are no rules!");
			System.out.println("Rule2: Rule one is a lie. There are in face \"rules\" as this is a board game.");
			System.out.println("More rules can be found here: https://howdoyouplayit.com/candy-land-rules-play-candy-land/");
			System.out.println("");
			System.out.println("There will be a total of 4 players,");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("Press enter to continue.");
			String ready = userInput.nextLine();
		}
		if(rules.equals("no"))
		{
			System.out.println("Ok, let's get started");
		}
		System.out.println("Ok, here is the order");
		System.out.println(name1 + ", you will be player1 and the Gingerbread man.");
		System.out.println(name2 + ", you will be player2 and the CandyCane.");
		System.out.println(name3 + ", you will be player3 and the Gumdrop.");
		System.out.println(name4 + ", you will be player4 and the Icecream Cone.");
		System.out.println("");
	}
}

