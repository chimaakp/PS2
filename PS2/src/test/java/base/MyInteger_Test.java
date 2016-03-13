package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
	//true
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
	
	
	//false
	@Test
	public void testisEven1() {
		MyInteger tge = new MyInteger(7);
		assertFalse(tge.isEven());
	}

	@Test
	public void testisOdd1() {
		MyInteger tgo = new MyInteger(8);
		assertFalse(tgo.isOdd());
	}
	
	@Test
	public void  testisPrime1() {
		MyInteger tgp = new MyInteger(28);
		assertFalse(tgp.isPrime());
	}
	
	
	
	//true
	@Test
	public void testisEven2() {
		assertTrue(MyInteger.isEven(30));
	}

	@Test
	public void testisOdd2() {
		assertTrue(MyInteger.isOdd(77));
	}
	
	@Test
	public void  testisPrime2() {
		assertTrue(MyInteger.isPrime(83));
	}
	
	
	//false
	@Test
	public void testisEven3() {
		assertFalse(MyInteger.isEven(53));
	}

	@Test
	public void testisOdd3() {
		assertFalse(MyInteger.isOdd(6));
	}
	
	@Test
	public void  testisPrime3() {
		assertFalse(MyInteger.isPrime(4));
	}
	
	@Test
	public void testequals(){
		assertTrue(MyInteger.equals(6));
	}
	
}