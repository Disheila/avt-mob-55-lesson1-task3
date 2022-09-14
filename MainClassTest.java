import jdk.nashorn.internal.objects.NativeString;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class MainClassTest extends MainClass {

    @Test
    public void testGetClassString() {
        getClassString().substring(1,6); CharSequence expected = "Hello";
        getClassString().substring(1,6); CharSequence actual = "Hello";
        assertTrue("Test success", actual == expected);
        assertFalse("Test failure", actual != expected);
    }


}
