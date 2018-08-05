package apis.standard;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Java18NewsTest {
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
	
	interface Greeter {
	    String greet(String name);
	}
	
	@FunctionalInterface
	interface Greeter2 {
	    String greet(String name);
	}
	
	@Test 
	public void shouldExecute_LambdaExpression() {
		Greeter greeter = name -> "Hello " + name;
		
		String result = greeter.greet("John");
		
		assertEquals("Hello John", result);
	}
	
	@Test
	public void shouldChangeArray_viaStream() {
		List<String> names = Arrays.asList("Tom", "John", "Glenn", "Gilbert");
		
		List<String> result = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
		
		assertEquals("TOM", result.get(0));
		assertEquals("GILBERT", result.get(3));
	}
	
	

	@Test 
	public void shouldChangeArray_viaStream_wothDoubleColonOperator() {
		List<String> names = Arrays.asList("Tom", "John", "Glenn", "Gilbert");
		
		List<String> result = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		assertEquals("TOM", result.get(0));
		assertEquals("GILBERT", result.get(3));
	}
	
	@Test 
	public void shouldJoinStrings() {
		String result = String.join("-delimiter-", "A", "B", "C");
		
		assertEquals("A-delimiter-B-delimiter-C", result);
	}
	
	@Test 
	public void shouldJoinStrings_withRepeatString() {
		String result = String.join("", Collections.nCopies(5, "AB"));
		
		assertEquals("ABABABABAB", result);
	}
	
	
	@Test
	public void shouldUse_TypeAnnotation_notCauseError() {
		@Nonnegative int i = -5;
		assertEquals(-5, i);
	}
	
	@Test
	public void shouldUse_Comparator_comparing() {
		int[] intArray = {4, 2, 7, 1, 9};
		Comparator<Integer> integerComparator = Comparator.comparing(Integer::valueOf);
	    
		int result = Arrays
	        .stream(intArray)
	        .mapToObj(integer -> Integer.valueOf(integer))
	        .min(integerComparator)
	        .get();
		
		assertEquals(1, result);
	}
	
	@Test
	public void intStream() {
		int[] intArray = {4, 2, 7, 1, 9};
		
		int result = IntStream.of(intArray).min().getAsInt();
		
		assertEquals(1, result);
	}
}
