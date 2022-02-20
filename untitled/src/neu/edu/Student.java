package neu.edu;

public class Student extends Person {
    public Student(String name, int id, int age) {

        super(name, id, age);

    }

    public void takeQuiz(String quizName) {

        System.out.println("take quiz" + quizName);

    }
}
