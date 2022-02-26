package neu.edu;

public class Main {

    public static void main(String[] args) {
        SeattlePoliceDepartment spd = new SeattlePoliceDepartment("Seattle Police Department");
        Person p1 = new Person("Jimmy", 28);
        Person p2 = new Person("Susan", 50);
        Person p3 = new Person("Alice", 18);
        Person p4 = new Person("Kathy", 38);

        p1.subscribe(spd);
        p2.subscribe(spd);
        p3.subscribe(spd);
        spd.notifyCitizens("Please stay safe!");

        p1.unsubscribe(spd);
        p2.unsubscribe(spd);
        p4.subscribe(spd);
        spd.notifyCitizens("Alert on 34th Street!");


    }
}
