package models;

public class Student {
    private int rollNumber;
    private String name;

    public Student(int number, String name){
        this.rollNumber = number;
        this.name = name;
    }

    // Copy Constructor
    public Student(Student stu){
        this.name = stu.name;
        this.rollNumber = stu.rollNumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int printRoll(){
        return rollNumber;
    }

    public String printName(){
        return name;
    }
}
