package homework.homework2;

public class PsinaKing {
     String name;
     int number;
    public PsinaKing(String personName, int rulesNumber) {
        this.name = personName;
        this.number = rulesNumber;
    }
    public void getName() {
        System.out.println("King " + this.name);
    }
    public void getNumber() {
        System.out.println("Ruler " + this.number);

    }
    public void setNewRuler(String newRuler) {
        this.name = "Правитель - " + name + " " + number +" умер, " + "новый правитель - " + newRuler;
        System.out.println(name);
    }
}
