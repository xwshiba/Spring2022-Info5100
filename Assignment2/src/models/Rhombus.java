package models;

public class Rhombus extends Shape{
    private float d1;
    private float d2;

    public Rhombus(float d1, float d2){
        super("Rhombus", null);
        this.d1 = d1;
        this.d2 = d2;

        float area = (float) (d1 * d2 * 0.5);
        this.setArea(area);
        float perimeter = (float) (Math.sqrt(d1 * d1 + d2 * d2) * 0.5 * 4);
        this.setPerimeter(perimeter);
    }

    public Rhombus(float d1){
        super("Rhombus", null);
        this.d1 = d1;
        this.d2 = d1;

        float area = (float) (d1 * d2 * 0.5);
        this.setArea(area);
        float perimeter = (float) (Math.sqrt(d1 * d1 + d2 * d2) * 0.5 * 4);
        this.setPerimeter(perimeter);
    }

    public float getD1() {
        return d1;
    }

    public void setD1(float d1) {
        this.d1 = d1;
    }

    public float getD2() {
        return d2;
    }

    public void setD2(float d2) {
        this.d2 = d2;
    }

    @Override
    public float getArea(){
        return (float) (d1 * d2 * 0.5);
    }

    @Override
    public float getPerimeter(){
        return (float) (Math.sqrt(d1 * d1 + d2 * d2) * 0.5 * 4);
    }
}
