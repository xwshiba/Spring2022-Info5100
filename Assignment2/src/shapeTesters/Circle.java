package shapeTesters;

public class Circle extends Shape{
    private double radius;
    private double PI = 3.14;

    public Circle(){
        super();
        this.radius = 0;
        this.setName("Circle");
    }

    public Circle(double radius){
        super(); // // optional
        this.radius = radius;
        this.setName("Circle");

        double area = PI * radius * radius;
        this.setArea(area);
        double perimeter = 2 * PI * radius;
        this.setPerimeter(perimeter);
    }

    public void computeArea(){
        System.out.println("The area for the the " + this.getName() + " is: " + this.getArea());
    }

    public void computePerimeter(){
        System.out.println("The perimeter for the " + this.getName() + " is: " + this.getPerimeter());
    }
}
