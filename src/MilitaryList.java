import java.util.ArrayList;
import java.util.List;

public class MilitaryList {
    private List<MilitaryPerson> militaryList;

    // Конструктор
    public MilitaryList() {
        militaryList = new ArrayList<>();
    }

    // Метод добавления военного
    public void addMilitary(MilitaryPerson person) {
        militaryList.add(person);
    }

    // Метод печати списка военных
    public void printMilitaryList() {
        for (MilitaryPerson person : militaryList) {
            System.out.println(person);
            System.out.println("-----------------------------");
        }
    }
}
