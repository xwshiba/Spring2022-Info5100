package models;

public class Parallelogram extends Shape{
    private float base;
    private float height;
    private float side;

    public Parallelogram(float base, float height, float side){
        super("Parallelogram", null);
        this.base = base;
        this.height = height;
        this.side = side;

        float area = base * height;
        this.setArea(area);
        float perimeter = (side + base) * 2;
        this.setPerimeter(perimeter);
    }

    public Parallelogram(float side){
        super("Parallelogram", null);
        this.base = side;
        this.height = side;

        float area = base * height;
        this.setArea(area);
        float perimeter = (side + base) * 2;
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

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    @Override
    public float getArea(){
        return base * height;
    }

    @Override
    public float getPerimeter(){
        return (side + base) * 2;
    }
}
