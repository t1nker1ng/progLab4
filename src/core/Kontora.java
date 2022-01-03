package core;

public class Kontora extends Entity{
    private final String name;
    public Kontora(){
        super();
        name = "Контора";
        Story();
    }
    public Kontora(String name){
        super(name);
        this.name=name;
        Story();
    }
    public void Story(){
        System.out.println(name + " ворвалась в трэпхату");
    }
    public void NoOne(){
        System.out.println(name + " не имеет внутри никого");
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
