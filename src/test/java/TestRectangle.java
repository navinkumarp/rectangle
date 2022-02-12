import org.testng.Assert;
import org.testng.annotations.Test;


public class TestRectangle {

    @Test
    public void testRectangleArea_threePointFiveAndThree_tenPointFive() {
        Rectangle rectangle = new Rectangle((float) 3.5,(float) 3);
        Assert.assertEquals(rectangle.getArea() ,10.5);
    }

    @Test
    public void testRectangleArea_twoAndThree_six() {
        Rectangle rectangle = new Rectangle(2,3);
        Assert.assertEquals(rectangle.getArea() ,6);
    }

    @Test
    public void testRectangleArea_threePointTwoTwoAndThreePointTwo_tenPointFive() {
        Rectangle rectangle = new Rectangle((float) 3.22,(float) 3.2);
        Assert.assertEquals(rectangle.getArea() ,10.30, 0.01);
    }

    @Test
    public void testRectanglePerimeter_twoAndThree_twelve() {
        Rectangle rectangle = new Rectangle((float) 3.22,(float) 3.2);
        Assert.assertEquals(rectangle.getPerimeter() ,10.30, 0.01);
    }


}
