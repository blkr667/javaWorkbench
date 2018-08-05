package apis.standard.news1_8;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;


public class StringJoinerTest {
	
	@Test 
	public void shouduseStringJoiner_withSeparator() {
		StringJoiner sj = new StringJoiner(":");
		sj.add("George").add("Sally").add("Fred");
		 
		String resultString = sj.toString();
		
		assertEquals("George:Sally:Fred", resultString);
	}
	
	@Test 
	public void shouduseStringJoiner_withSeparator_andClosures() {
		StringJoiner sj = new StringJoiner(":", "[", "]");
		sj.add("George").add("Sally").add("Fred");
		 
		String resultString = sj.toString();
		
		assertEquals("[George:Sally:Fred]", resultString);
	}
	
	@Test 
	public void  shouduseStringJoiner_viaCollector_withSeparator() {
		String[] names = {"George", "Sally", "Fred"};
		Stream<String> stream = Arrays.stream(names);
		 
		String resultString = stream.collect(Collectors.joining(":"));
		
		assertEquals("George:Sally:Fred", resultString);
	}
	
	@Test 
	public void  shouduseStringJoiner_viaCollector_withSeparator_andClosures() {
		String[] names = {"George", "Sally", "Fred"};
		Stream<String> stream = Arrays.stream(names);
		 
		String resultString = stream.collect(Collectors.joining(":", "[", "]"));
		
		assertEquals("[George:Sally:Fred]", resultString);
	}

}
