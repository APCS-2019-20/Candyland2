package objects;

public class Character 
{
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

	public String getGamePiece() 
	{
		return gamePiece;
	}

	public void setGamePiece(String gamePiece) 
	{
		Character.gamePiece = gamePiece;
	}
	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		Character.location = location;
	}

	public boolean getSkip() 
	{
		return skip;
	}

	public void setSkip(boolean skip) 
	{
		Character.skip = skip;
	}

	public boolean getStuck() 
	{
		return stuck;
	}

	public void setStuck(boolean stuck) 
	{
		Character.stuck = stuck;
	}
}
