package objects;

public class Tile 
{
	//var
	private String color;
	private String place;
	private int shortcut; //set as -1 if none exist, otherwise take player to this location
	private boolean stuck;
	private boolean skip;
	//constructor
	public Tile(String c, String p, int sh, boolean st, boolean sk)
	{
		color = c;
		place = p;
		shortcut = sh;
		stuck = st;
		skip = sk;
	}
	//getters
	public String getColor()
	{
		return(color);
	}
	public String getPlace()
	{
		return(place);
	}
	public boolean isStuck(){return this.stuck;}
	public void setStuck(boolean stuck){this.stuck = stuck;}
	public boolean isSkip(){return this.skip;}
	public void setSkip(boolean skip){this.skip = skip;}
	public int getShortcut()
	{
		return shortcut;
	}
}
