package neu.edu;

import models.Parallelogram;
import models.Player;
import models.Student;
import models.Triangle;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student(101, "ABC");
        System.out.println(" Roll number of the first student: "+ student1.printRoll());
        System.out.println(" Name of the first student: "+ student1.printName());

        Student student2 = new Student(student1);
        System.out.println(" Roll number of the second student: "+ student2.printRoll());
        System.out.println(" Name of the second student: "+ student2.printName());

        Parallelogram sq = new Parallelogram(4f);
        sq.getPerimeter();
        sq.getArea();
        System.out.println(sq.printShape());

        Triangle tr = new Triangle(4f);
        tr.getPerimeter();
        tr.getArea();
        System.out.println(tr.printShape());

        // Comparator
        Player abby = new Player("Abby", 14);
        Player john = new Player("John", 20);
        Player billy = new Player("Billy", 14);
        Player bill = new Player("Bill", 14);
        Player tommy = new Player("Tommy", 17);
        Player[] players = {abby, john, billy, bill, tommy};
        printPlayers(players);

        Comparator<Player> playerComparator = (p1, p2) -> {
            if (p1.getScore() > p2.getScore()){
                return -1;
            }
            else if (p1.getScore() < p2.getScore()){
                return 1;
            }
            else {
                return p1.getName().compareTo(p2.getName());
            }
        };
        Arrays.sort(players, playerComparator);
        printPlayers(players);
    }

    private static void printPlayers(Player[] players){
        System.out.println("*****************");
        for (Player p: players) {
            p.printInfo();
        }
    }
}
