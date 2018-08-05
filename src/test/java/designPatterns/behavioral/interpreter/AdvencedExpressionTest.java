package designPatterns.behavioral.interpreter;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class AdvencedExpressionTest {
	private AdvencedExpression advencedExpression;

	@Test
	public void shouldValidateExpression_successfullAnd() {
		// given\
		TerminalExpression expr1 = new TerminalExpression("a");
		TerminalExpression expr2 = new TerminalExpression("b");
		TerminalExpression expr3 = new TerminalExpression("c");
		advencedExpression = new AdvencedExpression(expr1, expr2, expr3);
		
		// when
		boolean result = advencedExpression.interpret("a");
		
		//then
		assertTrue(result);
	}
	
	@Test
	public void shouldValidateExpression_successfullOr() {
		// given\
		TerminalExpression expr1 = new TerminalExpression("a");
		TerminalExpression expr2 = new TerminalExpression("b");
		TerminalExpression expr3 = new TerminalExpression("c");
		advencedExpression = new AdvencedExpression(expr1, expr2, expr3);
		
		// when
		boolean result = advencedExpression.interpret("bc");
		
		//then
		assertTrue(result);
	}

	@Test
	public void shouldValidateExpression_withFailure() {
		// given\
		TerminalExpression expr1 = new TerminalExpression("a");
		TerminalExpression expr2 = new TerminalExpression("b");
		TerminalExpression expr3 = new TerminalExpression("c");
		advencedExpression = new AdvencedExpression(expr1, expr2, expr3);
		
		// when
		boolean result = advencedExpression.interpret("b");
		
		//then
		assertFalse(result);
	}
}
