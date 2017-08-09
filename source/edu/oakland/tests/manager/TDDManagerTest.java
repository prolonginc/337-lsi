import org.junit.*;
import org.junit.runner.RunWith;
import edu.oakland.production.manager.*;
import static org.junit.Assert.*;

import edu.oakland.production.display.*;
import edu.oakland.production.middleware.*;
import edu.oakland.production.database.*;
import java.util.*;

public class TDDManagerTest {
	private TTTManager manager;
	private TTTDisplay display;
	private TTTMiddleware middleware;
	private TTTDatabase database;
	
	@Before
	// create display and manager classes
	public void initializeSystem() {
		manager = new TTTManager();
		database = new TTTDatabase();
		middleware = new TTTMiddleware(database);
		display = new TTTDisplay(middleware);
	}
	
	@Test
	public void testPlaceMarkOnBoard() {
		//manager.placeMarkOnBoard();
	}
	
	@Test
	public void testPrintCurrentBoard() {
		//manager.printCurrentBoard();
	}
	
	@Test
	public void testChangePlayer() {
		/*
		char current = manager.getCurrentPlayer();
		char temp = 'O';
		
		if ( current == 'X' ) temp = 'O';
		manager.changePlayer();
		
		boolean resultX = ( temp == current);
		
		if ( current == 'O' ) temp = 'X';
		manager.changePlayer();
		
		boolean resultO = (temp == current);
	
		assertTrue(resultX && resultO);		
		*/
	}
	
	@Test
	public void test_Initial_Win_Or_Draw_is_false() {	
		//manager.checkForWinOrDraw();
		//assertFalse(manager.getGameIsOver());
	}
	
	/* Must Wait on interface classes to write tests
	@Test
	public void test_WinOrDraw_Win() {
		//Play the game
		manager.checkForWinOrDraw();
		assertFalse(manager.getGameIsOver());
	}
	
	@Test
	public void test_WinOrDraw_Win() {
		//Play the game
		manager.checkForWinOrDraw();
		assertFalse(manager.getGameIsOver());
	}
	*/
}
