package objects;

public class Tile 
{
	//var
	private final String COLOR;
	private final String LOCATION;
	private static int SHORTCUT; //set as -1 if none exist, otherwise take player to this location
	private final boolean STUCK;
	private final boolean SKIP;
	//constructor
	public Tile(String c, String l, int sh, boolean st, boolean sk)
	{
		COLOR = c;
		LOCATION = l;
		SHORTCUT = sh;
		STUCK = st;
		SKIP = sk;
	}
	//getters
	public String getColor()
	{
		return(COLOR);
	}
	public String getLocation()
	{
		return(LOCATION);
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
