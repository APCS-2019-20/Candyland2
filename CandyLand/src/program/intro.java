package program;

import java.util.Scanner;

public class intro {
//Michael
	public static void greeting()
	{
		Scanner userInput = new Scanner (System.in);
		
		System.out.print("Hello, Welcome to Candyland. ");
		System.out.println("What is your name?");
		
		String name = userInput.nextLine();
		
		System.out.println("Hello " + name + ". Welcome to Candyland once again.");
		
		System.out.println("Would you like the rules?");
		
		String rules = userInput.nextLine();
		if( rules.equals("yes"))
		{
			System.out.println("Here are the rules");
			
			System.out.println("Press enter to continue.");
			String ready = userInput.nextLine();
			
			 if(ready.equals("ready"))
			{
				System.out.println("Ok, let's get start");
			}
		
		}
		if(rules.equals("no"))
		{
			System.out.println("Ok, let's get started");
		}
	}
}

