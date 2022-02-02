package models;

public class Box {
    private double width;
    private double height;
    private double depth;

    public Box(double w, double h, double d){
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double calcBoxVolume(){
        if (width <= 0 || height <= 0 || depth <= 0){
            return -1;
        }
        double volume = width * height * depth;
        return volume;
    }
}
