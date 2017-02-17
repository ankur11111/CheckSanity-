package CheckSanity.CheckSanity;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	 
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	
    	System.out.println("Hello 1 in checksanity");
        assertTrue( false );
      
    }
    public void test2()
    {
    	
    	System.out.println("Hello 2 in checksanity");
        assertTrue( true );
      
    }
    
    
    
}
