import org.junit.*;
import org.junit.runner.RunWith;
import edu.production.*;


public class TDDManagerTest {
	private TicTacToeManager manager;
	private TTTDisplay display;
	
	@Before
	// create display and manager classes
	public void initializeSystem() {
		manager = new TicTacToeManager();
		display = new Display();
	}
	
	@Test
	public void testPrintCurrentBoard() {
		assertTrue(true);
	}
	
	@Test
	public void testChangePlayer() {
		display.changePlayer();
		assertTrue(true);
	}
	
}
