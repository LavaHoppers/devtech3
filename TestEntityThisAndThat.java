import junit.framework.*;
import org.junit.*;
import EntityThisAndThat.EntityThis;


public class TestEntityThisAndThat extends EntityThis {

   protected void setUp() {

   }


   @Test
   public void testSaveWorksWhenAlways() {

   }
   
   @Test
    public void testConstructor() {
        this = new EntityThis();
        assertNotEquals(null, this)
    }
}