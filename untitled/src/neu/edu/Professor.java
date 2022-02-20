package neu.edu;

public class Professor extends Person{



    public Professor(String name, int id, int age) {

        super(name, id, age);

    }

    public void giveQuiz(String quizName) {

        System.out.println("give quiz" + quizName);

    }


}
