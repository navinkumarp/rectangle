import org.testng.Assert;
import org.testng.annotations.Test;


public class TestRectangle {

    @Test
    public void testRectangleArea_TwoAndThree_Six() {
        Rectangle rectangle = new Rectangle(2,3);
        Assert.assertEquals(rectangle.getArea() ,6);
    }
}
