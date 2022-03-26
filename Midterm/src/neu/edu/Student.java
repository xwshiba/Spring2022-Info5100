package neu.edu;

public class Student {
    private String name;
    private int id;
    private long gpa;

    public Student(String nm, int id, long gpa) {
        this.name = nm;
        this.id = id;
        this.gpa = gpa;
    }

    // Copy Constructor
    public Student(Student stu){
        this.name = stu.name;
        this.id = stu.id;
        this.gpa = stu.gpa;
    }

    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getGpa() {
        return gpa;
    }

    public void setGpa(long gpa) {
        this.gpa = gpa;
    }
}
