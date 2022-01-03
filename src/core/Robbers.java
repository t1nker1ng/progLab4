package core;

public class Robbers extends Entity{
    private final String name;
    private final RunType type = RunType.SHOOT;
    private final Items type1 = Items.PISTOL;

    public Robbers() {
        super();
        name = "Грабители";
        Story();
    }

    public Robbers(String name) {
        super(name);
        this.name = name;
        Story();
    }

    public void Story() {
        System.out.println(name + " ворвались в трэпхату");
    }

    public void Spy(){
        System.out.println(name + " делали вид, как будто они обыкновенные");
    }

    public void Close(){
        System.out.println(name + " закрыли дверь");
    }

    public void Ugrojat(BankAccounter bankAccounter){
        if (type1 == Items.PISTOL) {
            System.out.println(name + " начали угрожать пистолетом " + bankAccounter);
        }
    }

    public void Telling(BankAccounter bankAccounter){
        System.out.println(name + " велели " + bankAccounter + " лечь лицом вниз");
    }

    public void Prikaz(BankAccounter bankAccounter){
        System.out.println(name + " приказали" + bankAccounter + " открыть несгораемую кассу");
    }
    public void GotOutOfTrapHouse(){
        System.out.println(name + " вышли на улицу");
    }
    public void Spotted(Police police) {
        System.out.println(name + " были замечены " + police);
    }

    public void Shoot(Police police) {
        if (type == RunType.SHOOT) {
            System.out.println(name + " развернулись и начали стрелять по " + police.getName());
        }
    }

    public void JobDone() {
        System.out.println(name + " прострелили шину и оторвались");
    }

    public void DidntHelp(){
        System.out.println("Это не помогло " + name + " уйти от возмездия");
    }

    public void Shooting(Police police){
        System.out.println("Началась перестрелка между " + name + " " + police.getName());
    }

    public void Break(Car car){
        System.out.println(name + " удалось вывести из строя обе " + car.getName());
    }

    public void NoMoney(){
        System.out.println(name + " не имело денег");
    }
    public void Telling(Chemodan chemodan){
        System.out.println(name + " не видели " + chemodan + ", и не видели банк, и не думали грабить");
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