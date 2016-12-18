package mainGame;

public interface ActionsInterface {
	//TODO Should this be an enum, how will commands work?
	//commands from the keyboard will be mapped to actions in this list
	//and those actions will effect the game world, in the commandActionMapper
	
	/**
	 * The list of acceptable actions for the character to do.
	 * @author Mary
	 *
	 */
	public static enum ActionsList {GoNorth, GoSouth, GoEast, GoWest, 
		TakeObject, Interact, DropObject, Dance, ReportInventory, DescribePlace,
		DescribeObject, QuickReportPlace}

}
