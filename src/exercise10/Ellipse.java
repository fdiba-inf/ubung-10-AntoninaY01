package exercise10;

public class Ellipse extends Figure {
    
    public Ellipse() {
        super(new Point(0, 0) 1, 1);
        
    }

    public Ellipse(Point startPoint, double a, double b) {
        super (startPoint, a, b);
       
    }

    public Ellipse(Ellipse otherEllipse) {
        super(otherEllipse.startPoint, otherEllipse.side1, otherEllipse.side2);
    }
    
    @override
    public double calculatePerimeter() {
        return Math.PI * (3.0 * (side1 + side2) - Math.sqrt((3.0 * side1 + side2) * (side1 + 3.0 * side2)));
    }

    public double calculateArea() {
        return Math.PI * side1 * side2;
    }

    public String getType() {
        return (side1 == side2) ? "Circle" : "Ellipse";
    }

    public String toString() {
        return String.format("%s-[%s, %s], %s, P=%s, A=%s", startPoint, side1, side2, getType(), calculatePerimeter(), calculateArea());
    }
    @override
    public boolean equal(Figure otherFigure) {
    if(otherFigure instanceof Ellipse){
      return super.equal(otherFigure);
    }else{
      return false;
    }
    }
    @override
    public boolean containsClick(Point click) {
        // Check if click point is inside the rectangle
        return false;
    }
}
