@@ -19,11 +19,12 @@ TicTacToeManager manager = new TicTacToeManager();
 
 // launch and initialize all TTTgame classes; 
 manager.launchApp(); 
-manager. chooseSquare(); 
+manager.chooseSquare(); 
 }
 
 // provide method to launch s intialize; must do TTTDatabase first; 
-public void launchRpp() {
+public void launchapp() {
+	// creaating new instrances of database, middleware, amnd display with information revelant to the current turn
 // launch a initialize database; make sure all cells are empty; 
 // launch a intialize middleware; pass in database ref; 
 // launch a initialize display; pass in middleware ref; 
@@ -33,24 +34,30 @@ public void launchRpp() {
  public void chooseSquare() {
 /* use the Scanner class to request first player's input from the command line, including "Playerl" or "Player2", currentPlayerMark either 'X' or '0'; */ 
 printCurrentBoard(); 
-checkForWinOrDraw(); 
+// Access gamemboard to print out current board
+checkForWinOrDraw();
+// Acces middleware checkforwinordraw, boolea
 }
-
 // provide method to check for win or draw; if none change players; 
-public void checkSorwinOrDraw() {
-// got results of the win or draw check; 
+public void checkForWinOrDraw() {
+// get results of the win or draw check; 
 iswinOrDraw - display.checkForWinOrDraw(); 
-if(lisMinOrDrawRosult) ( changePlayers(); else {
+// If it is nto a win or draw, switch player
+if(isWinOrDrawResult)
+(changePlayers(); 
+	}	
+	else {
 /* provide Java code to print either a win or draw to the command line and game over - restart; */ 
 // provide method to print Board status; 
 }
 
 public void printcurrentBoard() {
- // add Java code here; }
+ // add Java code here; 
 // provide method to change players if no win or draw; 
 }
 public void changePlayers() {
-display.changeDlayer(curreetPlayerMark),;
+	//calling changeplayer for player to be changed, passing the current player
+display.changePlayer(curretPlayerMark),;
 // now loop back to the chooseSquare() method;
  chooseSquare(); 
 }
