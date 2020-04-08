package objects;

public class Character 
{
	//Jon
	
	private static String gamePiece;
	private static int location;
	private static boolean skip;
	private static boolean stuck;
	
	public Character(String g, int l, boolean sk, boolean st)
	{
		setGamePiece(g);
		setLocation(l);
		setSkip(sk);
		setStuck(st);
	}

	public static String getGamePiece() 
	{
		return gamePiece;
	}

	public static void setGamePiece(String gamePiece) 
	{
		Character.gamePiece = gamePiece;
	}
	public static int getLocation() {
		return location;
	}

	public static void setLocation(int location) {
		Character.location = location;
	}

	public static boolean getSkip() 
	{
		return skip;
	}

	public static void setSkip(boolean skip) 
	{
		Character.skip = skip;
	}

	public static boolean getStuck() 
	{
		return stuck;
	}

	public static void setStuck(boolean stuck) 
	{
		Character.stuck = stuck;
	}
}
