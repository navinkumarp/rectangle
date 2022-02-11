public class Rectangle {

    float length;
    float breadth;

    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public float getArea() {
        return length * breadth;
    }
}
