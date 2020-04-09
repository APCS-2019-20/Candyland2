package program;
import java.util.ArrayList;
import objects.Tile;

public class exit 
{
	public static void win(String win)
	{
		win = "";
		for(int i = 0; i < board.length; i++)
		{	
			if(i == 134)
			{
				for(objects.Character won : players)
				{
					System.out.println("Congratulations, " + win + " you just won the game!");
				}
			}
		}
	}
}
