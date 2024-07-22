package testNGPractice;

import org.testing.annotations.Test; 
import junit.framework.Assert; 

public class NewTest {
  @Test
  public void verfiyTitle() { 

	 Assert.assertEquals("Yahoo","Yahoo");
  } 
  @Test public void 
  abcd() { 
	  Assert.assertEquals("Gmail","Gmail");
  } 
  @Test public void abc() 
  { 
	 
	  Assert.assertEquals("Gmail","Gmail"); 
  }
}
