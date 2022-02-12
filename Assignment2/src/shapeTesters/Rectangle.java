package shapeTesters;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(){
        super();
        this.length = 0;
        this.width = 0;
        this.setName("Rectangle");
    }

    public Rectangle(double length, double width){
        super(); // optional
        this.length = length;
        this.width = width;
        this.setName("Rectangle");

        double area = length * width;
        this.setArea(area);
        double perimeter = 2 * (length + width);
        this.setPerimeter(perimeter);
    }

    public void computeArea(){
        System.out.println("The area for the " + this.getName() + " is: " + this.getArea());
    }

    public void computePerimeter(){
        System.out.println("The perimeter for the " + this.getName() + " is: " + this.getPerimeter());
    }
}
