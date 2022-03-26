package neu.edu;

public class Sad extends Moody{
    public String mood;
    public String subjectName;

    public Sad(String subjectName){
        mood = "sad";
        this.subjectName = subjectName;
    }

    @Override
    public String getMood(){
        return "I feel " + mood + " today";
    }

    @Override
    public void expressFeelings() {
        System.out.println("'waah' 'boo hoo' 'weep' 'sob'");
    }

    public String toString(){
        return "Subject cries a lot";
    }

    @Override
    public void queryMood() {
        System.out.println("Override");
    }
}
