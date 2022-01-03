package core;

public class Julio extends Entity{
    private final String name;
    public Julio(){
        super();
        name = "Джулио";
        Story();
    }
    public Julio(String name){
        super(name);
        this.name=name;
        Story();
    }
    public void Story(){
        System.out.println(name + " ворвались в трэпхату");
    }
    public void Tell(){
        System.out.println(name + " рассказал историю");
    }
    public void EndStory() {
            System.out.println(name + " вышел из трэпхаты");
    }

    public String toString() {
        return "Korotishki name - " + name;
    }

    public String getName() {
        return name;
    }
}
