package apis.standard.news1_8.streams;

import static org.junit.Assert.*;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.junit.Test;


public class IntStreamTest {
	@Test
	public void shouldGetMin() {
		int[] intArray = {4, 2, 7, 1, 9};
		
		int result = IntStream.of(intArray).min().getAsInt();
		
		assertEquals(1, result);
	}
	
	@Test 
	public void shouldCreateArray_withSize() {
		int size = 5; 
		String result = IntStream.rangeClosed(1, size)
        .mapToObj(String::valueOf)
        .collect(Collectors.joining(""));

		  assertEquals("12345", result);
	}
	
}
