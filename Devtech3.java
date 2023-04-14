import java.beans.Transient;

import junit.framework.*;
import java.util.Date;

public class TestEntityThisAndThat extends EntityThis {

    // test the pk column name
    @Test
    public void testPrimaryKeyColumnName() {
        assertEquals(self.primaryKeyColumnName(), "This_pk");
    }

    // test the pk column index
    @Test
    public void testPrimaryKeyColumnIndex() {
        assertEquals(self.primaryKeyColumnIndex(), 1);
    }

    // test corret primary key
    @Test
    public int testPrimaryKey() {
        EntityThis e = new EntityThis();
        e.load(1);
        assertEquals(e.primaryKey(), 1)
    }

   //test to make sure contstructor works
   @Test
    public void testConstructor() {
        EntityThis thisObject = new EntityThis();
        assertNotEquals(null, thisObject);
        thisObject = new EntityThis(5);
        assertEquals(thisObject.primaryKey(), 5);
    }
    //test to make sure setAbc and getAbc work
    @Test
    public void testAbc() {
      EntityThis thisObject = new EntityThis();
      thisObject.setAbc("Hello World");
      String result = thisObject.getAbc();
      assertEquals(result, "Hello World");
    }

    //test to make sure setDef and getDef work
    @Test
    public void testDef() {
      EntityThis thisObject = new EntityThis();
      thisObject.setDef(5);
      int result = thisObject.getDef();
      assertEquals(result, 5);
    }

    //test to make sure setGhi and getGhi Work
    @Test
    public void testGhi() {
      EntityThis thisObject = new EntityThis();
      Date today = new Date();
      thisObject.setGhi(today);
      Date result = thisObject.getGhi();
      assertEquals(result, today);
    }
    
    //test to make sure get/set jkl values work
    @Test
    public void testJkl() {
      enum JKLValues {
         X,
         Y,
         Z
       }
       EntityThis thisObject = new EntityThis();
       JKLValues jkl;
       thisObject.setJkl(jkl);
       JKLValues result = thisObject.getJkl();
       assertEquals(result, jkl);
    }

    // remove
    @Test
    public void testRemove() {
        EntityThis e = new EntityThis();
        e.load(1);
        asssertTrue(e.remove());
    }


}