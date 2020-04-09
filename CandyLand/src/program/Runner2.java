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
		intro.greeting();
		setup.startup();
		//game
		while(!atEnd())
		{
			data.turn = (data.turn + 1) % data.players.size();
			playa = data.players.get(data.turn);
			System.out.println(playa.getGamePiece() + "'s turn!");
			enta.nextLine();
			draw = data.cards[(int) (Math.random()*data.cards.length)];
			if(draw.getName().equals(data.board[playa.getLocation()].getColor()))
			{
				System.out.println("You drew the correct color card, so you are no longer stuck.");
				playa.setStuck(false);
			}
			 if(!playa.getSkip() || !playa.getStuck())
			{
				System.out.println("");
				playa.setLocation(findClosest(playa.getLocation(), draw.getName()));
				if(draw.getCount() == 1)
				{
					playa.setLocation(findClosest(playa.getLocation(), draw.getName()));
				}
				System.out.println("You have landed on space" + playa.getLocation());
			}
			else
			{
				System.out.println("You are unable to draw. :(");
			}
			if(playa.getSkip())
			{
				playa.setSkip(false);
			}
			playa.setSkip(data.board[playa.getLocation()].getSkip());
			playa.setStuck(data.board[playa.getLocation()].getStuck());
			System.out.println("Press enter to continue to the next players turn.");
			enta.nextLine();
		}
		//end
		exit.win(playa.getGamePiece());
	}
	
	public static int findClosest(int current, String name)
	{
		int closest = current;
		for(int i = current; i < data.board.length; i++)
		{
			if(data.board[i].getPlace().equals(name))
			{
				closest = i;
				break;
			}
			else if(data.board[i].getColor().equals(name))
			{
				closest = i;
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
