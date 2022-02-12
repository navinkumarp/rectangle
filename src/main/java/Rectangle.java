public class Rectangle {

    float length;
    float breadth;

    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle(float side) {
        this.length = side;
        this.breadth = side;
    }

    public float calculateArea() {
        return length * breadth;
    }

    public float calculatePerimeter() {
        return 2 * (length + breadth);
    }
}
