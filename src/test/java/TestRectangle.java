import org.testng.Assert;
import org.testng.annotations.Test;


public class TestRectangle {

    @Test
    public void testRectangleArea_twoAndThree_six() {
        Rectangle rectangle = new Rectangle(2,3);
        Assert.assertEquals(rectangle.calculateArea() ,6);
    }

    @Test
    public void testRectangleArea_threePointFiveAndThree_tenPointFive() {
        Rectangle rectangle = new Rectangle((float) 3.5,(float) 3);
        Assert.assertEquals(rectangle.calculateArea() ,10.5);
    }

    @Test
    public void testRectangleArea_threePointTwoTwoAndThreePointTwo_tenPointThree() {
        Rectangle rectangle = new Rectangle((float) 3.22,(float) 3.2);
        Assert.assertEquals(rectangle.calculateArea() ,10.30, 0.01);
    }

    @Test
    public void testRectanglePerimeter_threeAndThree_twelve() {
        Rectangle rectangle = new Rectangle( 3, 3);
        Assert.assertEquals(rectangle.calculatePerimeter() ,12);
    }

    @Test
    public void testRectanglePerimeter_threePointFiveAndThree_tenPointFive() {
        Rectangle rectangle = new Rectangle((float) 3.5,(float) 3);
        Assert.assertEquals(rectangle.calculatePerimeter() ,13);
    }

    @Test
    public void testRectanglePerimeter_threePointTwoTwoAndThreePointTwo_tenPointFive() {
        Rectangle rectangle = new Rectangle( (float) 3.22, (float)3.2);
        Assert.assertEquals(rectangle.calculatePerimeter() ,12.84, 0.01);
    }

    @Test
    public void testSquareArea_two_four() {
        Rectangle square = new Rectangle(2);
        Assert.assertEquals(square.calculateArea() ,4);
    }


}
