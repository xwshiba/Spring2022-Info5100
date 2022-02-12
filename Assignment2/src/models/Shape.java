package models;

public class Shape {
    private String name;
    private String color;
    private float area;
    private float perimeter;

    public Shape(){
        this.name = "Sample";
        this.color = null;
        this.area = 0;
        this.perimeter = 0;
    }

    public Shape(String name, String color){
        this.name = name;
        this.color = color;
        this.area = 0;
        this.perimeter = 0;
    }

    public Shape(String name, String color, float area, float perimeter){
        this.name = name;
        this.color = color;
        this.area = area;
        this.perimeter = perimeter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(float perimeter) {
        this.perimeter = perimeter;
    }

    public String printShape(){
        return "The current shape is: " + name + " | Area: " + area + " | Perimeter: " + perimeter;
    }
}
