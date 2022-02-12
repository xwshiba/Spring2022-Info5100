package models;

public class Triangle extends Shape{
    private float base;
    private float height;

    public Triangle(float side){
        super("Triangle", null);
        this.base = side;
        this.height = (float) (0.5 * side * Math.sqrt(3));

        float area = (float) (0.5 * base * height);
        this.setArea(area);
        float perimeter = 3 * side;
        this.setPerimeter(perimeter);
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public float getArea(){
        return (float) (0.5 * base * height); // unnecessary
    }

    @Override
    public float getPerimeter(){
        return base * 3;
    }
}
