package adventure_game;


import java.util.HashMap;
import java.util.Map;

public class Maze {
	
	public Maze() {
		
	}
	
	private Map<String, Room> allTheRooms = new HashMap<String, Room>();
	
	public Room getRoom(String roomName) {
		return allTheRooms.get(roomName);
	}
	
	public void addRoom(String roomName, Room theRoom) {
		allTheRooms.put(roomName, theRoom);
	}
	
	

}
