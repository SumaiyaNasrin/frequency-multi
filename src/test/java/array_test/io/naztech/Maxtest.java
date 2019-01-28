package array_test.io.naztech;

import org.junit.Test;

import junit.framework.TestCase;

public class Maxtest extends TestCase {
	
	@Test
	public void testCompare() {
		max_multiplication a=new max_multiplication();
		int g=a.maxx();
		int f=140;
		assertEquals(f,g);
		
		
		
	}
	@Test
	public void testmaxfreq() {
		frequency a=new frequency();
		int g=a. max();
		int f=3;
		assertEquals(f,g);
		
		
		
	}
	
	@Test
	public void testminfreq() {
		frequency a=new frequency();
		int g=a. min();
		int f=1;
		assertEquals(f,g);
		
		
		
	}

}
