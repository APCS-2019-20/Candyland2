package program;

import objects.Tile;
import objects.Card;
public class setup {
// Michael
	
	public static void board() 
	{
		data.colors[0] = "red";
		data.colors[1] = "green";
		data.colors[2] = "yellow";
		data.colors[3] = "orange";
		data.colors[4] = "purple";
		data.colors[5] = "blue";
	int random;
	for(int j = 0; j < 134; j++)
	{
		random  =(int) Math.random()*6;	
		if(j%50 ==0)
		{
			data.Board[0] = new Tile(data.colors[random], "",-1, true, false);	
		}
		else if(j%55 ==0)
		{
			data.Board[0] = new Tile(data.colors[random], "",-1, false, true);	
		}
		else if(j == 4 )
		{
			data.Board[0] = new Tile(data.colors[random], "",59, false, false);	
		}
		 if(j == 9 )
		{
			data.Board[0] = new Tile(data.colors[random], "Plumpy",-1, false, false);	
		}
		 if(j == 18 )
			{
				data.Board[0] = new Tile(data.colors[random], "Candy Cane Forrest",-1, false, false);	
			}
		 if(j == 43 )
			{
				data.Board[0] = new Tile(data.colors[random], "Jolly",-1, false, false);	
			}
		 if(j == 75 )
			{
				data.Board[0] = new Tile(data.colors[random], "Gramma Nutt",-1, false, false);	
			}
		 if(j == 96 )
			{
				data.Board[0] = new Tile(data.colors[random], " Princess Lolly",-1, false, false);	
			}
		 if(j == 104 )
			{
				data.Board[0] = new Tile(data.colors[random], "Ice Cream Sea",-1, false, false);	
			}
		
		else
		{
			data.Board[0] = new Tile(data.colors[random], "",-1, false, false);
		}
	}
	for(int k = 0; k < 61; k++)
	{
		random  =(int) Math.random()*6;	
		if(k %18 ==0)
		{
			data.Cards[k] = new Card(data.colors[random], 1);
		}
		else
		{
			data.Cards[k] = new Card(data.colors[random], 0);
		}
		
	}
	
	}
}
