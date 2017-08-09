package edu.oakland.helper;

import edu.oakland.production.*;
import java.util.*;

public class TTTManager{

 // reference variable for subsystems
private TTTDisplay display;
private TTTMiddleware middleware;
private TTTDatabase database;
private Scanner scanner;
private char currentPlayer;
// private char currentPlayerMark;
private boolean isWinOrDrawResult;
private boolean gameIsOver;
//private TTTDatabase database;

// provide method to launch s intialize; must do TTTDatabase first;
	public TTTManager() {
	this.gameIsOver = false;
	this.currentPlayer = 'x';
	}
public void launchapp() {

// creating new instrances of database, middleware, and display with information revelant to the current turn
// launch a initialize database; make sure all cells are empty;
// launch a intialize middleware; pass in database ref;
// launch a initialize display; pass in middleware ref;

	this.database = new TTTDatabase();
	this.middleware = TTTMiddleware(this.database);
	this.display = TTTDisplay(this.middlware);


	// this may need to be its own method
	while(this.gameIsOver == false){


	//Displaying the board
	this.printCurrentBoard();
	// giving display current team,
	this.placeMarkOnBoard();
	// Checking if game is over
	this.gameIsOver = this.checkForWinOrDraw();

	// changing the player
	changePlayer();
	}
}

public void placeMarkOnBoard(){


	this.display.placeMarkOnBoard(this.currentPlayer);
}

public boolean checkForWinOrDraw(){

	return display.checkForWinOrDraw();

}

private void changePlayer(){
	// changing the player
	if (this.currentPlayer == 'x') {
		this.currentPlayer='o';
	}
	else {
		this.currentPlayer='x';
	}
}

public void printCurrentBoard() {
	display.printCurrentBoard();


}

public char getCurrentPlayer(){
	return this.currentPlayer;
}

public boolean getGameIsOver(){
	return this.gameIsOver;
}
}
