package adventure_game;

import java.util.Scanner;

public class AdventureGame {
	
	/**
	 * Sets up the initial game conditions
	 */
	private void setUpGame() {
		
		
		return;	
	} // end setUpGame
	
	public static String getStringInput(String request) {
		String anInput;
		Scanner in = new Scanner(System.in);
		System.out.println(request);
		anInput = in.nextLine();
		in.close();
		//change everything to lower case to make comparison easier
		anInput = anInput.toLowerCase();
		// TO DO:  Need to add some error catching (try) and valid input/security check
		return anInput;
	}

	public static void main(String[] args) {
		// set up the map
		Maze myMaze = new Maze();
		Room myArchway = new Room();
		myArchway.setName("Archway");
		myArchway.setDescription("You are in an Archway.");
		myArchway.setExits("East");
		
		Room myHallway = new Room("Hallway", "You are in a dark Hallway."
				+ " There is a terrible smell.");
		//System.out.println("testing toString: " + myHallway.toString());
		//System.out.println("testing printing my object: " + myHallway);
		
		myMaze.addRoom("Archway", myArchway);
		myMaze.addRoom("Hallway", myHallway);
		myMaze.addRoom("Long Room", new Room("Long Room", "You are in a long room."));
		
		// create the Player
		String playersName = getStringInput("What is your name?");
		Player playerOne = new Player(playersName);
		playerOne.setLocation(myMaze.getRoom("Archway"));
		
		String userInput;
		boolean shouldWeKeepPlaying = true;
		
		// start gameplay, while playerIsAlive and hasNotWon
		while(playerOne.getIsAlive() && shouldWeKeepPlaying) {
			// print out description
			System.out.println(playerOne.getLocation());
			
			// get user input
			userInput = getStringInput(playerOne.getName() + ", What do you want to do?");
			
			// evaluate input
			
			// give the game a turn Monsters, etc
			
			// calculate stuff: is player still alive?  has player won?
			shouldWeKeepPlaying = false;
			
		} // end while loop	

	} // end main

} // end class
