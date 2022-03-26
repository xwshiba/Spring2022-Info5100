package neu.edu;

public class Happy extends Moody{
    public String mood;
    public String subjectName;

    public Happy(String subjectName){
        mood = "Happy";
        this.subjectName = subjectName;
    }
    @Override
    public String getMood() {
        String happyString = "heeehee....hahahah...HAHAHA!!";
        return happyString;
    }

    @Override
    public void expressFeelings() {
        String feelingString = "Subject laughs a lot";
        System.out.println(feelingString);

    }

    public String toString(){
        return "I feel " + "happy" + " today";
    }

    @Override
    public void queryMood() {
        System.out.println("Override");
    }
}
