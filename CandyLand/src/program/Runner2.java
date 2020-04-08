package program;

import java.beans.IntrospectionException;

import objects.Card;
import javax.xml.stream.events.Characters;

import objects.Character;
import objects.Tile;

public class Runner2 
{
	public static void main(String[] args) 
	{
		//var
		Card draw;
		Character playa;
		String win;
		//begining
		intro.greeting();
		settup.startup();
		//game
		while(!atEnd())
		{
			data.turn = (data.turn + 1) % data.players.size();
			playa = data.players.get(data.turn);
			draw = data.cards[(int) (Math.random()*data.cards.length)];
			if()
			{
				
			}
		}
		//end
		exit.win(data.turn);
	}
	public static int findClosest()
	{
		
	}
	public static boolean atEnd()
	{
		boolean space136 = false;
		for(Character p: data.players)
		{
			if(p.getLocation() == data.board.length)
			{
				space136 = true;
			}
		}
		return(space136);
	}
}
