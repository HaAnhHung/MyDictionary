import org.junit.Assert;
import org.junit.Test;

public class testjunit
{
    @Test
    public void checkMax()
    {
        junit jun1 = new junit(2, 3);
        Assert.assertEquals(3, jun1.Max(2, 3));

        junit jun3 = new junit(13, 56);
        Assert.assertEquals(56, jun3.Max(13, 56));

        junit jun2 = new junit(4, 3);
        Assert.assertEquals(4, jun2.Max(4, 3));

        junit jun5 = new junit(-45, -34);
        Assert.assertEquals(-34, jun5.Max(-45, -34));

        junit jun4 = new junit(765, 1524);
        Assert.assertEquals(1524, jun4.Max(765, 1524));
    }

}
