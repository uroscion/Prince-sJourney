package mainGame;

import static java.lang.System.*;


/**
 * A text based adventure game similar to King's Quest 1.
 * Class main, the main entry point into the program.
 * @author Todd J Fleming
 * Date: 12/18/2016
 */
public class Main {

	/*
	 * @args 
	 */
	public static void main(String[] args) {
		// create game loop
		boolean hasWon = true, running = true;
		out.println(Messages.welcomeMessage);
		//TODO create a character, make character class give inventory, give place
		//create commands, map, places, interactions, monsters?, etc.
		GameWorld world = new GameWorld();
		Character prince = new Character();
		
		while(running){
			//TODO
			if (hasWon = true){//TODO this should be a call to character to determine if points is high enough
				running = false;
			}
		}

	}

}
