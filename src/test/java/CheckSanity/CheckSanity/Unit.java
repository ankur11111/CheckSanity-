package CheckSanity.CheckSanity;

import junit.framework.TestCase;
import junit.framework.Test;
import junit.framework.TestSuite;

public class Unit extends TestCase{

	  public Unit( String testName )
	    {
	        super( testName );
	    }

	    /**
	     * @return the suite of tests being tested
	     */
	    public static Test suite()
	    {
	        return new TestSuite( Unit.class );
	    }
	  //  @Test
	public void testUnit1()
	{
		
		System.out.println("UnitTest");
		assertTrue( true );
	}
}
