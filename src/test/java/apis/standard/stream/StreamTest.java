package apis.standard.stream;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;
import org.junit.Test;


/*
 * https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html
 * 
 * https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
 */

public class StreamTest {

	@Test 
	public void shouldFilter() {
		Stream<String> namesStream =
			    Arrays.asList("Tom", "John", "Glenn", "Gilbert").stream();
		
		Stream<String> resultStream = namesStream.filter(s -> s.startsWith("G"));
		
		assertEquals(2, resultStream.count());
	}
	
	@Test 
	public void shouldMap() {
		Stream<String> namesStream =
			    Arrays.asList("Tom", "John").stream();
		
		Stream<String> resultStream = namesStream.map(String::toUpperCase);

		assertEquals(true, resultStream.allMatch(s -> s.equals("TOM") || s.equals("JOHN")));
	}
	
	@Test 
	public void shouldReduce_withAccumulator() {
		Stream<Integer> namesStream =
			    Arrays.asList(1, 2, 3).stream();
		
		Optional<Integer> reductionResult = namesStream.reduce(
				(reduceState, currentElement) -> reduceState + currentElement);

		assertEquals(new Integer(6), reductionResult.get());
	}
	
	@Test 
	public void shouldReduce_withAccumulator_identity() {
		int identityValue = 0;
		Stream<Integer> namesStream =
			    Arrays.asList(1, 2, 3).stream();
		
		int reductionResult = namesStream.reduce(
				identityValue,
				/* accummulutar */(reduceState, currentElement) -> reduceState + currentElement);

		assertEquals(6, reductionResult);
	}
	
	/*
	 * reduce(identity, accumulator, combiner) useful when parallelStream()
	 * combiner combine two accumulated elements
	 */
	@Test 
	public void shouldReduce_withAccumulator_identity_combiner() {
		int identityValue = 0;
		Stream<Integer> namesStream =
			    Arrays.asList(1, 2, 3).parallelStream();
		
		int reductionResult = namesStream.reduce( 
				identityValue,
				/* accummulutar */(reduceState, currentElement) -> reduceState + currentElement,
				/* combiner */(currentAccumulatedElement, otherAccumulatedElement) -> currentAccumulatedElement + otherAccumulatedElement);

		assertEquals(6, reductionResult);
	}
}
