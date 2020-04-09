package program;

import java.util.ArrayList;
import objects.*;
import objects.Character;
import objects.Tile;

public class data 
{
	public static Tile[] board = new Tile[134]; //fill BOARD here bc it is final
	public static Card[] cards = new Card[66]; //fill CARDS here bc it is final
	public static ArrayList<Character> players = new ArrayList<Character>();
	public static int turn = 0;
	static String[] colors = new String [6];
}
