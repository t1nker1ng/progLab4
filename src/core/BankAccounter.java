package core;

public class BankAccounter extends Entity {
    private final String name;
    private final RunType type = RunType.LYING;

    public BankAccounter() {
        super();
        name = "Сотрудница Банка";
        Story();
    }

    public BankAccounter(String name) {
        super(name);
        this.name = name;
        Story();
    }

    public void Story() {
        System.out.println(name + " зашла в трэпхату");
    }

    public void Spotted(Robbers robbers) {
        if (type == RunType.LYING) {
            System.out.println(name + " легла на пол, увидев " + robbers.getName());
        }
    }

    public void ScaredAsFuck(Robbers robbers){
        System.out.println(name + " перепуганный насмерть выполнил приказ " + robbers);
    }

    public void Sit(Robbers robbers){
        System.out.println(name + " пригрожен быть пристреленным как собакой " + robbers + " сидеть в несгораемом сундуке");
    }
    public void CallThePolice() {
        System.out.println(name + " позвонила в полицию");
    }

    public void EndStory() {
        System.out.println(name + " вышла из трэпхаты");
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Workers name " + name;
    }
}