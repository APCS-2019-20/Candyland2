package objects;

public class Card {
//Danielle
	
	private String name;
	private String place;
	private boolean doubl;
	
	public Card(String n, String p, boolean d)
	{
		name = n;
		setPlace(p);
		setDoubl(d);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace()
	{
		return place;
	}

	public void setPlace(String place)
	{
		this.place = place;
	}

	public boolean isDoubl()
	{
		return doubl;
	}

	public void setDoubl(boolean doubl)
	{
		this.doubl = doubl;
	}
	
}
