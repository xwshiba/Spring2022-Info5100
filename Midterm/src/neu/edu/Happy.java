package neu.edu;

public class Happy extends Moody{
    public String mood;
    public String subjectName;

    public Happy(String subjectName){
        mood = "happy";
        this.subjectName = subjectName;
    }
    @Override
    public String getMood() {
        return "I feel " + mood + " today";
    }

    @Override
    public void expressFeelings() {
        System.out.println("heeehee....hahahah...HAHAHA!!");
    }

    public String toString(){
        return "Subject laughs a lot";
    }

    @Override
    public void queryMood() {
        System.out.println("Override");
    }
}
