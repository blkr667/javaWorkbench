package apis.standard.news1_8.streams;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.junit.Test;


public class StreamComparingTest {
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
	
}
