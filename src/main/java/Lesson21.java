public class Lesson21 extends  Lesson2{
    private  Languge language;

    public Lesson21(){

    }

    public Lesson21(int age, String name, Languge language){
        super(age, name);
        this.language = language;
    }

    public  void setLanguage(Languge language){
        this.language = language;
    }

    public Languge getLanguage(){
        return language;
    }

    @Override
    public  void work(){
        System.out.println(this.name + " is working on" + this.language);
    }
}
