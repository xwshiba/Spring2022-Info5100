package neu.edu;

import java.util.ArrayList;

public class SeattlePoliceDepartment {
    private String name;
    private ArrayList<Person> subscribers;

    public SeattlePoliceDepartment(String name){
        this.name = name;
        this.subscribers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void notifyCitizens(String message){
        for (Person p: subscribers){
            p.getNotified(message);
        }

    }

    public void subscribe(Person p){
        if (!subscribers.contains(p)) {
            subscribers.add(p);
        } else {
            System.out.println(p.getName() + " has already subscribed.");
        }
    }

    public void unsubscribe(Person p){
        if (subscribers.contains(p)){
            subscribers.remove(p);
        } else {
            System.out.println(p.getName() + " has not subscribed yet.");
        }
    }


}
