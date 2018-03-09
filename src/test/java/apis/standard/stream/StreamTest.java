package apis.standard.stream;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.stream.Stream;
import org.junit.Test;


/*
 * https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html
 * 
 * https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
 */

public class StreamTest {


	@Test 
	public void shouldFilterStream() {
		Stream<String> namesStream =
			    Arrays.asList("Tom", "John", "Glenn", "Gilbert").stream();
		
		Stream<String> resultStream = namesStream.filter(s -> s.startsWith("G"));
		
		assertEquals(2, resultStream.count());
	}
	
	@Test 
	public void shouldMapStream() {
		Stream<String> namesStream =
			    Arrays.asList("Tom", "John").stream();
		
		Stream<String> resultStream = namesStream.map(String::toUpperCase);

		assertEquals(true, resultStream.allMatch(s -> s.equals("TOM") || s.equals("JOHN")));
	}
}
