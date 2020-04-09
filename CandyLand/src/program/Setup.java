package program;
import java.util.Scanner;
import objects.Character;
import objects.Tile;
import objects.Card;
public class Setup
{
// Michael
	
	public static void board() 
	{
		Data.colors[0] = "red";
		Data.colors[1] = "green";
		Data.colors[2] = "yellow";
		Data.colors[3] = "orange";
		Data.colors[4] = "purple";
		Data.colors[5] = "blue";
	
		for (int j = 0; j < 134; j++)
		{
			if (j % 50 == 0)
			{
				Data.board[j] = new Tile(Data.colors[(int) (Math.random() * 6)], "", -1, true, false);
			} 
			else if (j % 55 == 0)
			{
				Data.board[j] = new Tile(Data.colors[(int) (Math.random() * 6)], "", -1, false, true);
			} 
			else if (j == 1)
			{
				Data.board[j] = new Tile("pink", "", 59, false, false);
			}
			else if (j == 3)
			{
				Data.board[j] = new Tile("pink", "Plumpy", -1, false, false);
			}
			else if (j == 11)
			{
				Data.board[j] = new Tile("pink", "Candy Cane Forrest", -1, false, false);
			}
			else if (j == 13)
			{
				Data.board[j] = new Tile("pink", "Jolly", -1, false, false);
			}
			else if (j == 21)
			{
				Data.board[j] = new Tile("pink", "Gramma Nutt", -1, false, false);
			}
			else if (j == 23)
			{
				Data.board[j] = new Tile("pink", "Princess Lolly", -1, false, false);
			}
			else if (j == 31)
			{
				Data.board[j] = new Tile("pink", "Ice Cream Sea", -1, false, false);
			}
			else 
			{
				Data.board[j] = new Tile(Data.colors[(int) (Math.random() * 6)], "", -1, false, false);
			}
			//System.out.println("Data.board[" + j + "]: " + Data.board[j].getColor() + " " + Data.board[j].getPlace() + " " + Data.board[j].getShortcut() + " " + Data.board[j].isSkip() + " " + Data.board[j].isStuck());
		}
	}

	public static void cards()
	{
		Data.colors[0] = "red";
		Data.colors[1] = "green";
		Data.colors[2] = "yellow";
		Data.colors[3] = "orange";
		Data.colors[4] = "purple";
		Data.colors[5] = "blue";
	
		for(int k = 0; k < 66; k++)
		{

			
			int random  = (int)( Math.random()*6 );	
			//System.out.println(data.colors[random]);
			if(k == 1)
			{
				Data.cards[k] = new Card("Jolly",  0);
			}
			else if(k == 3)
			{
				Data.cards[k] = new Card("Candy Cane Forrest",  0);
			}
			else if(k == 11)
			{
				Data.cards[k] = new Card("Plumpy",  0);
			}
			else if(k == 13)
			{
				Data.cards[k] = new Card("Gramma Nutt",  0);
			}
			else if(k == 21)
			{
				Data.cards[k] = new Card("Princess Lolly",  0);
			}
			else if(k == 23)
			{
				Data.cards[k] = new Card("Ice Cream Sea", 0);
			}
			else if(k %18 ==0)
			{
				Data.cards[k] = new Card(Data.colors[random],  1);
			}
			else
			{
				Data.cards[k] = new Card(Data.colors[random], 0);
			}
			//System.out.println("Data.cards[" + k + "] " + Data.cards[k].getName() + " " + Data.cards[k].getCount());
		}
	}


	public static void startup()
	{
		//	Scanner userInput = new Scanner (System.in);
		board();
		cards();
		Data.players.add(new Character("Gingerbread man", 0, false, false));
		//System.out.println("Length: " + Data.players.size() + " Mostresent: " + Data.players.get(Data.players.size()-1).getGamePiece() + " Oldest: " + Data.players.get(0).getGamePiece());
		Data.players.add(new Character("CandyCane", 0, false, false ));
		//System.out.println("Length: " + Data.players.size() + " MostrResent: " + Data.players.get(Data.players.size()-1).getGamePiece() + " Oldest: " + Data.players.get(0).getGamePiece());
		Data.players.add(new Character("Gumdrop", 0, false, false ));
		//System.out.println("Length: " + Data.players.size() + " MostResent: " + Data.players.get(Data.players.size()-1).getGamePiece() + " Oldest: " + Data.players.get(0).getGamePiece());
		Data.players.add(new Character("Icecream Cone", 0, false, false));
		//System.out.println("Length: " + Data.players.size() + " MostResent: " + Data.players.get(Data.players.size()-1).getGamePiece() + " Oldest: " + Data.players.get(0).getGamePiece());
	}
}
	
