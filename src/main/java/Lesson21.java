public class Lesson21 extends  Lesson2{
    private  String language;

    public Lesson21(){

    }

    public  Lesson21(int age, String name, String language){
        super(age, name);
        this.language = language;
    }

    public  void setLanguage(String language){
        this.language = language;
    }

    public String getLanguage(){
        return language;
    }
}
