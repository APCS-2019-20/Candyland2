package program;

import java.util.Scanner;
import objects.Character;

public class setup 
{

	public static void startup()
	{
		Scanner userInput = new Scanner (System.in);
		Scanner userInput1 = new Scanner (System.in);
		Scanner userInput2 = new Scanner (System.in);
		Scanner userInput3 = new Scanner (System.in);
		
		int birth1 = userInput.nextInt();
		int birth2 = userInput1.nextInt();
		int birth3 = userInput2.nextInt();
		int birth4 = userInput3.nextInt();
		
		data.players.add(new Character("Gingerbread man",  false, false ));
		data.players.add(new Character("CandyCane",  false, false ));
		data.players.add(new Character("Gumdrop",  false, false ));
		data.players.add(new Character("Icecream Cone",  false, false ));
	}
}
