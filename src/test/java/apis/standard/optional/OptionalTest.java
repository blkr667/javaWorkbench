package apis.standard.optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.junit.Test;


public class OptionalTest {
	@Test
	public void shoulSuccessfullyGetInstanceFromOptional () {
		//given
		String str = "hello";
		//when
		Optional<String> stringOptional = Optional.of( str );
		//then
		assertTrue(stringOptional.isPresent());
		assertEquals("HELLO", stringOptional.get().toUpperCase());
	}
	
	@Test(expected = NoSuchElementException.class)
	public void shoulthrowNoSuchElementException_whenAccessToEmptyOptional() {
		//given
		Optional emptyOptional = Optional.empty();
		//when
		emptyOptional.get();
	}
	
	@Test
	public void shoulCreateEmptyOptional_whenOfNullableCreation () {
		//given
		Object nullableOnject = null;
		//when
		Optional nullableOptional = Optional.ofNullable( nullableOnject );
		//then
		assertFalse(nullableOptional.isPresent());
	}
	
	@Test(expected = NullPointerException.class)
	public void shoulthrowNullPointerException_whenCreateOptionalFromNull () {
		//given
		Object nullableOnject = null;
		//when
		Optional.of( nullableOnject );
	}
	
}
