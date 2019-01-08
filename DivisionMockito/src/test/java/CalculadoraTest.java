import static org.junit.Assert.*;
import org.junit.Test;

public class CalculadoraTest {
	@Test
	public void testDivision1() {
		Division d = new Division();
		assertEquals(new Double(2.0) , new Double(d.division(4.0,2.0)));
	}
	
	@Test
	public void testDivision2() {
		Division d = new Division();
		assertEquals(new Double(0.0) , new Double(d.division(0.0,2.0)));
	}
	
	@Test
	public void testDivision3() {
		Division d = new Division();
		assertEquals(new Double(-2.0) , new Double(d.division(-4.0,2.0)));
	}
	
	@Test
	public void testDivision4() {
		Division d = new Division();
		assertEquals(new Double(-2.0) , new Double(d.division(4.0,-2.0)));
	}
	
	@Test
	public void testDivision5() {
		Division d = new Division();
		assertEquals(new Double(2.0) , new Double(d.division(-4.0,-2.0)));
	}
}
