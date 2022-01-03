package core;

import items.Neck;
import items.Noses;
import items.Tire;

public class Police extends Entity implements Neck, Tire, Noses {
    private final String name;
    private final RunType type = RunType.CHASING;

    public Police() {
        super();
        name = "Полицейские";
        Story();
        SygnalAccepted();
    }

    public Police(String name) {
        super(name);
        this.name = name;
        Story();
    }

    public void Story() {
        System.out.println(name + " ворвались в трэпхату");
    }

    public void Game() {
        System.out.println(name + " играли в козла");
        System.out.println(name + " прекратили играть");
    }

    public void SygnalAccepted() {
        System.out.println(name + " улышали сигнал");
    }

    public void GetOut() {
        if (type == RunType.CHASING) {
            System.out.println(name + " Выскочили на улицу");
        }
    }

    public void Tear() {
        System.out.println("Шина порвалась");
    }

    public void GotOut() {
        System.out.println("5-ый полицейский вывалился из машинв");
    }

    public void Hit() {
        System.out.println("5-ый полицейский стукнулся о мостовую");
    }

    public void Kvas() {
        System.out.println(name + " Носы 4-х сотрудников были расквашены");
    }

    public void RollUp() {
        System.out.println("5 полицеский свернул себе шею");
    }

    public void Bronya(Car car){
        System.out.println(name + " пустило в ход " + car + " воуруженную пулеметами");
    }

    public void Zaderjat(Robbers robbers){
        System.out.println(name + " задержали " + robbers);
    }

    public void Deliver(Robbers robbers){
        System.out.println(name + " доставили " + robbers + " в полицейское управление");
    }
    public void Question(Robbers robbers){
        System.out.println(name + " задал вопрос, зачем они стреляли");
        System.out.println(robbers + " ответили на вопрос " + name + ", что не думали стрелять по полицейским, думая, что это грабители");
    }
    public void EndStory() {
        System.out.println(name + " вышли из трэпхаты");
    }

    public String toString() {
        return "Cops name - " + name;
    }

    public String getName() {
        return name;
    }
}