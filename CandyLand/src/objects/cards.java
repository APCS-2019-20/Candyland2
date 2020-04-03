package objects;

public class cards {
//Danielle
	
	private String name;
	private int spaceCount;
	
	public cards(String n,int sC )
	{
		name = n;
		spaceCount = sC;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpaceCount() {
		return spaceCount;
	}

	public void setSpaceCount(int spaceCount) {
		this.spaceCount = spaceCount;
	}
}
