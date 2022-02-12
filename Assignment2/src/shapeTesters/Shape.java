package shapeTesters;

public class Shape {
    private String name;
    private double area;
    private double perimeter;

    public Shape(){
        this.name = "Sample Shape";
        this.area = 0;
        this.perimeter = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void display(){
        System.out.println("The Shape name is: " + this.name + " | area is: " + this.area + " | perimeter: " + this.perimeter);
    }

}
