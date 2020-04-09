package objects;

public class Character 
{
	private String gamePiece;
	private int location;
	private boolean skip;
	private boolean stuck;
	
	public Character(String g, int l, boolean sk, boolean st)
	{
		gamePiece = g;
		location = l;
		skip = sk;
		stuck = st;
	}

	public String getGamePiece() 
	{
		return gamePiece;
	}

	public void setGamePiece(String g) 
	{
		gamePiece = g;
	}
	public int getLocation() {
		return location;
	}

	public void setLocation(int l) {
		location = l;
	}

	public boolean getSkip() 
	{
		return skip;
	}

	public void setSkip(boolean s) 
	{
		skip = s;
	}

	public boolean getStuck() 
	{
		return stuck;
	}

	public void setStuck(boolean s) 
	{
		stuck = s;
	}
}
