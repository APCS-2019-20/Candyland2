package objects;

public class Card {
//Danielle
	
	private String name;
	private int count;
	
	public Card(String n, int c)
	{
		name = n;
		count = c;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount()
	{
		return count;
	}

	public void setCount(int count)
	{
		this.count = count;
	}
	
}
