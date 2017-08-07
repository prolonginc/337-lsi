package edu.oakland.helper; 

import edu.oakland.production.*; 
import java.util.*; 
public class TicTacToeManager{

 // reference variable for subsystems
private TTTDisplay display;
private TTTMiddleware middleware;
private TTTDatabase database;
private Scanner scanner;
private String currentPlayer;
private char currentPlayerMark;
private boolean isWinOrDrawResult; 
public static void maln(String() args){

// create instance of TTTManager; 
TicTacToeManager manager = new TicTacToeManager(); 

// launch and initialize all TTTgame classes; 
manager.launchApp(); 
manager.chooseSquare(); 
}

// provide method to launch s intialize; must do TTTDatabase first; 
public void launchapp() {
	// creaating new instrances of database, middleware, amnd display with information revelant to the current turn
// launch a initialize database; make sure all cells are empty; 
// launch a intialize middleware; pass in database ref; 
// launch a initialize display; pass in middleware ref; 
}

// provide method to select Board square;
 public void chooseSquare() {
/* use the Scanner class to request first player's input from the command line, including "Playerl" or "Player2", currentPlayerMark either 'X' or '0'; */ 
printCurrentBoard(); 
// Access gamemboard to print out current board
checkForWinOrDraw();
// Acces middleware checkforwinordraw, boolea
}
// provide method to check for win or draw; if none change players; 
public void checkForWinOrDraw() {
// get results of the win or draw check; 
iswinOrDraw - display.checkForWinOrDraw(); 
// If it is nto a win or draw, switch player
if(isWinOrDrawResult)
(changePlayers(); 
	}	
	else {
/* provide Java code to print either a win or draw to the command line and game over - restart; */ 
// provide method to print Board status; 
}

public void printcurrentBoard() {
 // add Java code here; 
// provide method to change players if no win or draw; 
}
public void changePlayers() {
	//calling changeplayer for player to be changed, passing the current player
display.changePlayer(curretPlayerMark),;
// now loop back to the chooseSquare() method;
 chooseSquare(); 
}
}
