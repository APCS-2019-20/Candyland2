package program;

import java.util.Scanner;

public class intro {
//Michael
	public static void greeting()
	{
		Scanner userInput = new Scanner (System.in);
		Scanner userInput1 = new Scanner (System.in);
		Scanner userInput2 = new Scanner (System.in);
		
		System.out.print("Hello, Welcome to Candyland.");
		System.out.println("What is your name?");
		
		String name = userInput1.nextLine();
		
		System.out.println("Hello " + name + ". Welcome to Candyland.");
		
		System.out.println("Would you like the rules?");
		
		String rules = userInput2.nextLine();
		if( rules == "yes")
		{
			System.out.println("Here are the rules");
			
			String ready = userInput.nextLine();
			
			if (ready == "ready")
			{
				System.out.println("Ok, let's get start");
			}
		
		}
	if(rules == "no" )
		{
			System.out.println("Ok, let's get started");
		}
	
}
	}

