package mainGame;

import mainGame.ActionsInterface.ActionsList;

/**
 * Maps keyboard line commands to actions and executes those actions.
 * @author Todd J Fleming
 * Date: 12/18/2016
 *
 */
public class CommandActionMapper {
	
	/**
	 * the game's one and only character. He has his inventory.
	 */
	private Character character;
	/**
	 * The game's one and only game world
	 */
	private GameWorld world;
	
	public CommandActionMapper(Character c, GameWorld w){
		this.character = c;
		this.world = w;
	}
	
	//TODO Expand how to map keyboard input to Actions
	public void mapCommand(String input){
		ActionsList action = ActionsList.GoNorth;//example of using actionsList enum
		
	}
}
