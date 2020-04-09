package program;

import java.beans.IntrospectionException;
import java.util.Scanner;

import objects.Card;
import objects.Character;
import objects.Tile;

public class Runner2 
{
	public static void main(String[] args) 
	{
		//var
		Card draw;
		Character playa = null;
		String win;
		Scanner enta = new Scanner(System.in);
		//begining
		//intro.greeting();
		Setup.startup();
		//game
		while(!atEnd())
		{
			//setVar
			Data.turn = (Data.turn + 1) % Data.players.size();
			playa = Data.players.get(Data.turn);
			draw = Data.cards[(int) (Math.random()*Data.cards.length)];
			//startTurn
			System.out.println("~ " + playa.getGamePiece() + "'s turn! ~");
			enta.nextLine();
			//skipSkipers
			if(!playa.getSkip())
			{
				System.out.println("Press enter to draw a card.");
				enta.nextLine();
			}
			//unstickStickers
			if(draw.getName().equals(Data.board[playa.getLocation()].getColor()) && playa.getStuck())
			{
				System.out.println("You drew the correct color card, so you are no longer stuck.");
				playa.setStuck(false);
			}
			//move
			if(!playa.getSkip() || !playa.getStuck())
			{
				System.out.println("You drew a " + draw.getName() + " card.");
				playa.setLocation(findClosest(playa.getLocation(), draw.getName()));
				if(draw.getCount() == 1)
				{
					playa.setLocation(findClosest(playa.getLocation(), draw.getName()));
				}
				System.out.println("You have landed on space " + playa.getLocation() + ".");
			}
			else
			{
				System.out.println("You are unable to draw. :(");
			}
			//unskipSkipper
			if(playa.getSkip())
			{
				playa.setSkip(false);
			}
			//setSkippersAndStucks
			playa.setSkip(Data.board[playa.getLocation()].getSkip());
			playa.setStuck(Data.board[playa.getLocation()].getStuck());
			//continue
			System.out.println("");
			System.out.println("Press enter to continue to the next players turn.");
			System.out.println("");
			enta.nextLine();
		}
		//end
		Exit.win(playa.getGamePiece());
	}
	
	public static int findClosest(int current, String name)
	{
		current++;
		int closest = current;
		for(int i = current; i < Data.board.length; i++)
		{
			if(Data.board[i].getPlace().equals(name))
			{
				closest = i;
				System.out.println("You get to move " + i + " spaces.");
				break;
			}
			else if(Data.board[i].getColor().equals(name))
			{
				closest = i;
				System.out.println("You get to move " + i + " spaces.");
				break;
			}
		}
		return(closest);
	}
	public static boolean atEnd()
	{
		boolean space134 = false;
		for(Character p: Data.players)
		{
			if(p.getLocation() == Data.board.length)
			{
				space134 = true;
			}
		}
		return(space134);
	}
}
