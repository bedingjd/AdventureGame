package adventure_game;

public class Player {
	
	public Player() {
	}
	
	public Player(String _name) {
		this.myName = _name;
	}
	
	private Room presentLocation;
	private int myMoney;
	private int myPoints;
	private int myHealth;
	private String myName;
	private boolean isAlive = true;
	
	public void setLocation(Room r) {
		this.presentLocation = r;
	}
	public Room getLocation() {
		return this.presentLocation;
	}
	
	public boolean getIsAlive() {
		return this.isAlive;
	}
	public void setDead() {
		this.isAlive = false;
	}
	public void setAlive() {
		this.isAlive = true;
	}
	public String getName() {
		return this.myName;
	}
	
	
	

}
