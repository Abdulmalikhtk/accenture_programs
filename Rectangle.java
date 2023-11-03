public class Rectangle {
    public static void main(String[] args) {
        RectangleApp rect = new RectangleApp();
        rect.setLength(10);
        rect.setBreadth(20);
        rect.calculateArea(); // Call the method to calculate area
        rect.calculateperimeter();
        System.out.println("Area of the rectangle: " + rect.getArea());
        System.out.println("perimeter of the rectangle: " +rect.getperimeter());
    }
}

class RectangleApp {
    private int length;
    private int breadth;
    private int area;
    private int perimeter;

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void calculateArea() {
        this.area = length * breadth;
    }
    public void calculateperimeter() {
        this.perimeter = 2*(length + breadth);
    }

    public int getArea() {
        return area;
    }
    public int getperimeter() {
        return perimeter;
    }

}
