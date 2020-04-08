package program;

import java.util.ArrayList;
import objects.*;
import objects.Character;
import objects.Tile;

public class data 
{
	public static  Tile[] Board= new Tile[134]; //fill BOARD here bc it is final
	public static final Card[] Cards = new Card[66]; //fill CARDS here bc it is final
	public static ArrayList<Character> players = new ArrayList<Character> ();
	public static int turn = 0;
	public static int cardPosition = 0;
	static String[] colors = new String [6];
	
}
