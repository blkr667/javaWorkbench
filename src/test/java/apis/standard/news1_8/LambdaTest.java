package apis.standard.news1_8;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LambdaTest {
	@FunctionalInterface
	interface Greeter {
	    String greet(String name);
	}
	
	@Test 
	public void shouldExecute_LambdaExpression() {
		Greeter greeter = name -> "Hello " + name;
		
		String result = greeter.greet("John");
		
		assertEquals("Hello John", result);
	}
	
}
