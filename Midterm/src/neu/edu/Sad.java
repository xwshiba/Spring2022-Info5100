package neu.edu;

public class Sad extends Moody{
    public String mood;
    public String subjectName;

    public Sad(String subjectName){
        mood = "Sad";
        this.subjectName = subjectName;
    }

    @Override
    public String getMood(){
        String sadString = "'waah' 'boo hoo' 'weep' 'sob'";
        return sadString;
    }

    @Override
    public void expressFeelings() {
        System.out.println("Subject cries a lot");
    }

    public String toString(){
        return "I feel " + "sad" + " today";
    }

    @Override
    public void queryMood() {
        System.out.println("Override");
    }
}
