package edu.oakland.production;

public interface ITTTManager {
	/**
	//The launchapp method is used to create and intialize all TTTgame classes
	//Create new isntances of the TTTgame classes relevant to the current turn
	//Launch and initalize database; make sure all cells are empty
	//Launch and initalize  middleware; pass in database ref
    //Launch and initalize  display; pass in middleware ref
    */
	void launchapp();

	
	/**
	Will access the gameboard and print out the current board
	*/
	printCurrentBoard();
	
	/**
	//The method for selecting the board square
	//Scanner class will request the input from the command line, "Player 1" or "Player2", currentPlayerMark 
	*/
	void chooseSquare();
	
	/**
	Access middleware and checkForWinOrDraw, will be a boolean
	*/
	 checkForWinOrDraw();
	  
	 /**
	 //Check for a win or draw if there is none change players
	 //Get reslts from the win or draw check
	 //If no win or draw then switch players
	 //Print either win or draw to the command line and game over - restart
	 */
	  
	 void checkForWinOrDraw();

 
	 /**
     //This method will check the current player 
     //Change the player when needed
     */
     
        
     changePlayer();
     
     /**
    //@return the current player char being either 'X' or 'O'
    */
   
    char getCurrentPlayer();

    
    
      /**
    //@return if the game is over or  not
    */
    boolean getGameIsOver();
  
     }
	