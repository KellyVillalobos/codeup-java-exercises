package shapes;

public class Square extends Quadrilateral {

    public Square(double length, double width) {
        super(length, width);
    }

    @Override
    protected void setlength(double length) {
        this.length = length;
    }

    @Override
    protected void setwidth(double width) {
        this.width = width;
    }


}
