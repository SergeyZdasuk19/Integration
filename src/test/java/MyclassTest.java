import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MyclassTest {

    @Test
    public void testMeth() {
        Myclass h = new Myclass();
        String line = h.meth();
        Assert.assertTrue(line.equals("hello"));
    }
}