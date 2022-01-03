package core;

public class AccBuyers extends Entity{
    private final String name;
    public AccBuyers(){
        super();
        name = "Покупатели";
        Story();
    }
    public AccBuyers(String name){
        super(name);
        this.name=name;
        Story();
    }
    public void Story(){
        System.out.println(name + " ворвались в трэпхату");
    }
    public void DidntCome(){
        System.out.println(name + " не являлись");
    }
    public void EndStory(){
        System.out.println(name + " вышли из трэпхаты");
    }
    public String toString() {
        return "AccBuyers name - " + name;
    }

    public String getName() {
        return name;
    }
}
