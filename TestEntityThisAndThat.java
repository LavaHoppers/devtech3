import devtech3.EntityThis;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
class TestEntityThis {
    
    @Test
    public void testConstructor() {
        this = new EntityThis();
        assertNotEquals(null, this)
    }

    
}