import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Nikhil on 9/25/2016.
 */
public class GroovyScriptParserTest {
	private GroovyScriptParser testObj;

	@Before
	public void setUp() throws Exception {
		testObj = new GroovyScriptParser();
	}

	@Test
	public void testGeneralArithematicExpression() throws Exception {
		TradeHolder holder = new TradeHolder();
		Object result = testObj.parse("3+5", holder);
		Assert.assertEquals(8, result);
	}

	@Test
	public void testGeneralLogicalExpression() throws Exception {
		TradeHolder holder = new TradeHolder();
		Object result = testObj.parse("t.asof < y.asof", holder);
		Assert.assertEquals(false, result);
	}

	@Test
	public void testStringConcatenation() throws Exception {
		TradeHolder holder = new TradeHolder();
		Object result = testObj.parse("t.tradeId + y.tradeId", holder);
		Assert.assertEquals("T1T1", result);
	}

}