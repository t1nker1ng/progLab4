package core;

public class NewsPaper extends Entity{
    private final String name;
    public NewsPaper(){
        super();
        name = "Газета";
        Story();
    }
    public NewsPaper(String name){
        super(name);
        this.name=name;
        Story();
    }
    public void Story(){
        System.out.println(name + " ворвалась в трэпхату");
    }
    public void Pestrelo(){
        System.out.println(name + " пестрела сообщениями");
    }
    public void Oproverg(){
        System.out.println(name + " опровергала слух о 40-50 бандитов");
        System.out.println(name + " сообщала, что бандитов только двое");
    }
    public void EndStory() {
        System.out.println(name + " вышла из трэпхаты");
    }

    public String toString() {
        return "Korotishki name - " + name;
    }

    public String getName() {
        return name;
    }
}
