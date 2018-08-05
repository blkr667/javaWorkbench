package apis.standard;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

class Animal {
	static {
		System.out.println("ANIMAL-STATIC-BLOCK");
	}
	
	{
		System.out.println("ANIMAL-INSTANCE-BLOCK");
	}
	
	Animal() {
		System.out.println("ANIMAL-CONSTRUCTOR");
	}
}

class Dog extends Animal {
	static {
		System.out.println("DOG-STATIC-BLOCK");
	}
	
	{
		System.out.println("DOG-INSTANCE-BLOCK");
	}
	
	Dog() {
		System.out.println("DOG-CONSTRUCTOR");
	}
}

public class InitializationTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	}

	@After
	public void restoreStreams() {
	    System.setOut(originalOut);
	}
	
	@Test 
	public void shouldInvokeBlocksInRightOrder() {
		new Dog();
		
		String[] result = outContent.toString().split("\\s+");
		
		assertEquals("ANIMAL-STATIC-BLOCK", result[0]);
		assertEquals("DOG-STATIC-BLOCK", result[1]);
		assertEquals("ANIMAL-INSTANCE-BLOCK", result[2]);
		assertEquals("ANIMAL-CONSTRUCTOR", result[3]);
		assertEquals("DOG-INSTANCE-BLOCK", result[4]);
		assertEquals("DOG-CONSTRUCTOR", result[5]);

	}
	


	

}
