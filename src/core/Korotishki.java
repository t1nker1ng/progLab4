package core;

public class Korotishki extends Entity {
    private final String name;
    private final RunType type = RunType.NOTHING_TO_KNOW;
    private final String[] people = {"Незнайка", "Мига", "Козлик"};
    private final String place = "Контора";

    public Korotishki() {
        super();
        name = "Коротышки";
        Story();
    }

    public Korotishki(String name) {
        super(name);
        this.name = name;
        Story();
    }

    public void Story() {
        for (int i = 0; i < 3; i++) {
            System.out.println(people[i] + " ворвался в трэпхату");
        }
    }
    public void Stay(){
        System.out.println(name + " засели в " + place);
    }
    public void Wait(){
        System.out.println(name + " ожидают покупателей акций");
    }
    public void Feeling(){
        System.out.println(people[1] + " опасался не напрасно");
    }
    public void EndStory() {
        for (int i = 0; i < 3; i++) {
            System.out.println(people[i] + " вышел из трэпхаты");
        }
    }

    public String toString() {
        return "Korotishki name - " + name;
    }

    public String getName() {
        return name;
    }
}
