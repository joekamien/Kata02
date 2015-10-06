import static org.junit.Assert.*;

import org.junit.Test;

public class Kata02Tester {

	@Test
	public void test() {
		try{
			  assertEquals(-1, Main.chop(3, new int[]{}));
			  assertEquals(-1, Main.chop(3, new int[]{1}));
			  assertEquals(0,  Main.chop(1, new int[]{1}));
			  
			  
			  assertEquals(0,  Main.chop(1, new int[]{1, 3, 5}));
			  assertEquals(1,  Main.chop(3, new int[]{1, 3, 5}));
			  assertEquals(2,  Main.chop(5, new int[]{1, 3, 5}));
			  assertEquals(-1, Main.chop(0, new int[]{1, 3, 5}));
			  assertEquals(-1, Main.chop(2, new int[]{1, 3, 5}));
			  assertEquals(-1, Main.chop(4, new int[]{1, 3, 5}));
			  assertEquals(-1, Main.chop(6, new int[]{1, 3, 5}));
			  
			  
			  assertEquals(0,  Main.chop(1, new int[]{1, 3, 5, 7}));
			  assertEquals(1,  Main.chop(3, new int[]{1, 3, 5, 7}));
			  assertEquals(2,  Main.chop(5, new int[]{1, 3, 5, 7}));
			  assertEquals(3,  Main.chop(7, new int[]{1, 3, 5, 7}));
			  assertEquals(-1, Main.chop(0, new int[]{1, 3, 5, 7}));
			  assertEquals(-1, Main.chop(2, new int[]{1, 3, 5, 7}));
			  assertEquals(-1, Main.chop(4, new int[]{1, 3, 5, 7}));
			  assertEquals(-1, Main.chop(6, new int[]{1, 3, 5, 7}));
			  assertEquals(-1, Main.chop(8, new int[]{1, 3, 5, 7}));
		}
		catch (Exception e)
		{
			fail("Exception encountered during test: " + e.toString() );
		}// catch (Exception e)
	}

}
