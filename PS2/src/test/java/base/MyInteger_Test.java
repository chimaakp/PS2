package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
	
	@Test
	public void testisEven() {
		MyInteger tge = new MyInteger(8);
		assertTrue(tge.isEven());
	}

	@Test
	public void testisOdd() {
		MyInteger tgo = new MyInteger(7);
		assertTrue(tgo.isOdd());
	}
	
	@Test
	public void  testisPrime() {
		MyInteger tgp = new MyInteger(29);
		assertTrue(tgp.isPrime());
	}
}