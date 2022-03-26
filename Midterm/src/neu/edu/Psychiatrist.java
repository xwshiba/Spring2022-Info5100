package neu.edu;

public class Psychiatrist {
    public String name;

    public Psychiatrist(){
        name = "Psychiatrist";
    }

    public void examine(Moody moodyObject){
        System.out.println("How are you feeling today?");
        System.out.println(moodyObject.getMood());
        moodyObject.expressFeelings();
    }

    public void observe(Moody moodyObject){
        System.out.print("Observation: ");
        System.out.println(moodyObject.toString());

    }
}
