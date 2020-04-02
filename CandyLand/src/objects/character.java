package objects;

public class character 
{
	//Jon
	
	private static String gamePiece;
	private static String birthday;
	private static boolean skip;
	private static boolean stuck;
	
	public character(String g, String b, boolean sk, boolean st)
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
		character.gamePiece = gamePiece;
	}

	public static String getBirthday() 
	{
		return birthday;
	}

	public static void setBirthday(String birthday) 
	{
		character.birthday = birthday;
	}

	public static boolean getSkip() 
	{
		return skip;
	}

	public static void setSkip(boolean skip) 
	{
		character.skip = skip;
	}

	public static boolean getStuck() 
	{
		return stuck;
	}

	public static void setStuck(boolean stuck) 
	{
		character.stuck = stuck;
	}
}
