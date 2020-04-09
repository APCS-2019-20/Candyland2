package objects;

public class Tile 
{
	//var
	private final String COLOR;
	private final String PLACE;
	private static int SHORTCUT; //set as -1 if none exist, otherwise take player to this location
	private final boolean STUCK;
	private final boolean SKIP;
	//constructor
	public Tile(String c, String p, int sh, boolean st, boolean sk)
	{
		COLOR = c;
		PLACE = p;
		SHORTCUT = sh;
		STUCK = st;
		SKIP = sk;
	}
	//getters
	public String getColor()
	{
		return(COLOR);
	}
	public String getPlace()
	{
		return(PLACE);
	}
	public boolean getStuck()
	{
		return(STUCK);
	}
	public boolean getSkip()
	{
		return(SKIP);
	}
}
