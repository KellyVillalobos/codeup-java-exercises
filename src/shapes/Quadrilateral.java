package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;



    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;

    }
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
    protected abstract void setlength(double length);
    protected abstract void setwidth(double width);

    @Override
    public double getPerimeter() {
        double perimeter = 2 * length + 2 * width;
        return perimeter;
    }

    @Override
    public double getArea() {
        double area = length * width;
        return area;
    }


}
