package neu.edu;

import shapeTesters.Circle;
import shapeTesters.Rectangle;
import shapeTesters.Shape;

public class shapeTester {

    public static void main(String[] args){
        Shape s = new Shape();
        Rectangle r = new Rectangle(2.0, 3.0);
        Circle c = new Circle(4.0);

        r.computeArea();
        r.computePerimeter();
        c.computeArea();
        c.computePerimeter();
        r.display();
        c.display();
        s.display();
    }
}
