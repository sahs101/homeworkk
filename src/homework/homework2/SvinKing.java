package homework.homework2;

public class SvinKing {
     String name;
     int number;
    public SvinKing(String personName, int rulerNumber) {
        this.name = personName;
        this.number = rulerNumber;

    }
public void getName() {
    System.out.println("King " + this.name);
}
public void getNumber() {
    System.out.println("Ruler " + this.number);

}
public void setNewRuler(String newRuler) {
        this.name = "Правитель - " + name + " " + number + " умер, " + "новый правитель - " + newRuler ;
    System.out.println(name);
    }
}