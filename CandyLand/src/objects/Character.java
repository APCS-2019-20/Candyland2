package objects;

public class Character 
{
	//Jon
	
	private static String gamePiece;
	private static String birthday;
	private static boolean skip;
	private static boolean stuck;
	
	public Character(String g, String b, boolean sk, boolean st)
	{
		setGamePiece(g);
		setBirthday(b);
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

	public static String getBirthday() 
	{
		return birthday;
	}

	public static void setBirthday(String birthday) 
	{
		Character.birthday = birthday;
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
