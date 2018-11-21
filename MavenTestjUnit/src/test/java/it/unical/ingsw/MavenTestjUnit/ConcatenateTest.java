package it.unical.ingsw.MavenTestjUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcatenateTest {

	@Test
	public void testConcatenate() {
	Junit test = new Junit();
	String result = test.concatenate("one", "two");
	assertEquals("onetwo", result);
	}

}
