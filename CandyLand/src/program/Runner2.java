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
		setup.startup();
		//game
		while(!atEnd())
		{
			//setVar
			data.turn = (data.turn + 1) % data.players.size();
			playa = data.players.get(data.turn);
			draw = data.cards[(int) (Math.random()*data.cards.length)];
			//startTurn
			System.out.println("MnM  " + playa.getGamePiece() + "'s turn!  MnM");
			enta.nextLine();
			//skipSkipers
			if(!playa.getSkip())
			{
				System.out.println("Press enter to draw a card.");
				enta.nextLine();
			}
			//unstickStickers
			if(draw.getName().equals(data.board[playa.getLocation()].getColor()) && playa.getStuck())
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
			playa.setSkip(data.board[playa.getLocation()].getSkip());
			playa.setStuck(data.board[playa.getLocation()].getStuck());
			//continue
			System.out.println("");
			System.out.println("Press enter to continue to the next players turn.");
			enta.nextLine();
		}
		//end
		exit.win(playa.getGamePiece());
	}
	
	public static int findClosest(int current, String name)
	{
		current++;
		int closest = current;
		for(int i = current; i < data.board.length; i++)
		{
			if(data.board[i].getPlace().equals(name))
			{
				closest = i;
				System.out.println("You get to move " + i + " spaces.");
				break;
			}
			else if(data.board[i].getColor().equals(name))
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
		for(Character p: data.players)
		{
			if(p.getLocation() == data.board.length)
			{
				space134 = true;
			}
		}
		return(space134);
	}
}
