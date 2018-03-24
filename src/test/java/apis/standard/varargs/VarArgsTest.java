package apis.standard.varargs;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class VarArgsTest {
	private List<String> arrayList;
	
	@Before
	public void setUp() {
		 arrayList = new ArrayList<>();
	}
	
	private void addToArray(String... arrayElements) {
		for(String element : arrayElements)
			arrayList.add(element);
	}

	@Test 
	public void checkVarArgsMethodWithoutArguments() {
		addToArray();
		
		assertEquals(0, arrayList.size());
	}
	
	@Test 
	public void checkVarArgsMethodWithOneArgument() {
		addToArray("Hello");
		
		assertEquals(1, arrayList.size());
	}
	
	@Test 
	public void checkVarArgsMethodWithTwoArguments() {
		addToArray("Hello", "World");
		
		assertEquals(2, arrayList.size());
	}
}
