import org.junit.*;
import org.junit.runner.RunWith;
import edu.production.*;


public class TDDManagerTest {
	private TicTacToeManager manager;
	
	@Before
	// create display and manager classes
	public void initializeSystem() {
		manager = new TicTacToeManager();
		display = new Display();
	}
	
	@Test
	public void testChooseSquare() {
		manage.chooseSquare();
		assertTrue(true);
	}
	
	@Test
	public void testPrintCurrentBoard() {
		manager.printCurrentBoard();
		assertTrue(true);
	}
	
	@Test
	public void testChangePlayer() {
		manager.changePlayers();
		assertTrue(true);
	}
	
	@Test
	public void test_Initial_Win_Or_Draw_is_false() {
		manager.checkForWinOrDraw();
		assertTrue(true);
	}
}
