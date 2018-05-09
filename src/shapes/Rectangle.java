package shapes;

public class Rectangle {
    protected double length;
    protected double width;
    protected String type;

    //-----default constructor------|
    public Rectangle(){}

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        this.type = "rectangle";
    }

    public String getType() {
        return type;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
           double area = length * width;
        return area;
        }
        public double getPerimeter(){
           double perimeter = 2 * length + 2 * width;
        return perimeter;
        }
        public String toString(){
        return ("A  " + getType() + " with the width of " + getWidth() + " and length of " + getLength() + "  has an area of " + getArea()
                + " and a perimeter of " + getPerimeter());
        }
}
