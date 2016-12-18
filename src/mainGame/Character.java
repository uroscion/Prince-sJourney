package mainGame;

public class Character {

	private int points;
	private Map map;
	private Inventory inventory;
	private String name;
	
	/**
	 * Creates a new character, sets points = 0 and initializes the map, name, and inventory.
	 */
	public Character()
	{
		this.name = "I have no name...";
		this.map = new Map();
		this.points = 0;
		this.inventory = new Inventory();
	}
	
	/**
	 * 
	 * @return the number of points this character has earned.
	 */
	public int getPoints(){
		return this.points;
	}
	
	/**
	 * @return the character's name.
	 */
	public String getYourName(){
		return name;
	}
	
}
