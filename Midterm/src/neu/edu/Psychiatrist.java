package neu.edu;

public class Psychiatrist {
    public String name;

    public Psychiatrist(){
        name = "Psychiatrist";
    }

    public void examine(Moody moodyObject){
        System.out.println(toString());
        System.out.println(moodyObject.getMood());
        System.out.println(moodyObject.toString());

    }

    public void observe(Moody moodyObject){
        System.out.print("Observation: ");
        moodyObject.expressFeelings();
    }

    public String toString(){
        return "How are you feeling today?";
    }
}
