package adventure_game;

import java.util.ArrayList;

public class Room {
	
	// constructor
	public Room() {
	}
	
	// a better constructor
	public Room(String name, String description) {
		myRoomName = name;
		this.setDescription(description);
	}
	
	// attributes
	private String myRoomName;
	private String myRoomDescription;
	
	// myRoomExits is an ArrayList of String cardinal directions
	private ArrayList<String> myRoomExits = new ArrayList<String>();
	
	
	// methods or behaviors
	
	// accessors or getter
	public String getName() {
		return myRoomName;
	}
	
	public String getRoomDescription() {
		return myRoomDescription;
	}

	
	// mutators or setters
	public void setName(String name) {
		myRoomName = name;
	}
	
	public void setDescription(String description) {
		myRoomDescription = description;
	}

	
	/**
	 * 	Provides a list of all available exits from this Room
	 * @return ArrayList of exits, where the values are cardinal
	 * directions in the form of a String: "North", "South", "East", "West"
	 */
	public ArrayList<String> getExits() {
		return myRoomExits;
	}
	
	/**
	 * Adds an available exit to a room
	 * @param Takes a String, which is a cardinal direction from the room
	 * Examples are: "North", "South", "East", "West"
	 * @return Returns void
	 * 
	 */
	public void setExits(String direction) {
		myRoomExits.add(direction);
	}
	
	/**
	 * Overrides the toString() method we inherited from Object
	 */
	//@overides
	public String toString() {
		//return super.toString() + this.getRoomDescription();
		return this.getRoomDescription();
	}
	
	

} // end class
