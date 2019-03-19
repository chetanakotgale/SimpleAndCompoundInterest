package calculate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class JUnitInput 
{
	
	/**
	 * Test cases for simple interest.
	 */
	
	@Test
	public void simpletest()
	{
		Main simple=new Main();
		assertEquals("Executed successfully",625.00,simple.simple(2500.0, 5, 5),0);
		assertEquals("Executed successfully",705.852,simple.simple(1400.5, 7.2, 7),0);
		assertEquals("Executed successfully",10864.292789000001,simple.simple(6801.235,9.8,16.3),0);
		
	}
	public void simplefail()
	{
		Main simple=new Main();
		assertFalse("Executed successfully",625.00!=simple.simple(2500.0, 5, 5));
		assertFalse("Executed successfully",705.852!=simple.simple(1400.5, 7.2, 7));
		assertFalse("Executed successfully",10864.292789000001!=simple.simple(6801.235,9.8,16.3));
		
	}

@Test
	
	/**
	 * Test cases for compound interest.
	 */
	
	public void compoundtest()
	{
		
		Main compound=new Main();
		assertEquals(1335.4332141502573,compound.compound(1200, 5.4, 2),0);
		assertEquals(1675.2365851637344,compound.compound(1523.00, 3.45, 2.8),0);
		assertEquals(213.7900282967706,compound.compound(156.24, 4.7, 6.9),0);
		
		
	}
	public void compoundfail()
	{
		
		Main compound=new Main();
		assertFalse(1335.4332141502573!=compound.compound(1200, 5.4, 2));
		assertFalse(1675.2365851637344!=compound.compound(1523.00, 3.45, 2.8));
		assertFalse(213.7900282967706!=compound.compound(156.24, 4.7, 6.9));
		
	}
}
