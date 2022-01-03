package core;

public class Chemodan extends Entity{
    private final String name;
    public Chemodan() {
        super();
        name = "Чемодан";
        Story();
    }

    public Chemodan(String name) {
        super(name);
        this.name = name;
        Story();
    }
    public void Story() {
        System.out.println(name + " ворвался в трэпхату");
    }

    public void GetMoney(Robbers robbers){
        System.out.println("В " + name + " положили деньги "+ robbers);
    }

    public void Taken(Robbers robbers){
        System.out.println(name + " был взят " + robbers);
    }

    public void Dissaper(){
        System.out.println(name + " испарился");
    }

    public void EndStory() {
        System.out.println(name + " вышли из трэпхаты");
    }

    public String toString() {
        return "Robbers name - " + name;
    }

    public String getName() {
        return name;
    }
}
