package core;

public class Car extends Entity {
    private final String name;
    public Car() {
        super();
        name = "Бибика";
        Story();
    }

    public Car(String name) {
        super(name);
        this.name = name;
        Story();
    }
    public void Story() {
        System.out.println(name + " ворвалась в трэпхату");
    }

    public void PoliceCar(Police police){
        System.out.println("Две " + name + " наполнилась " + police.getName());
        System.out.println(name + " включилась в преследование");
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
