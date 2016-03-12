package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
	
	@Test
	public void testgetiValue() {
		MyInteger tgi = new MyInteger(7);
		assertTrue(tgi, 7 );
	}


}