package homework.homework2;

public class work2_basic {
    public static void main(String[] args) {
        //задание 1
        for (int i = 0; i < 101 ; i++)

                System.out.print(i + "a ");
        System.out.println();

            //задание 2
            int ageChildren = 10;
            if (ageChildren < 6) {
                System.out.println("пошёл в сад");
            } else if (ageChildren < 11) {
                System.out.println("пошёл в младшую школу");
            } else if (ageChildren < 17) {
                System.out.println("пошёл в среднюю школу");
            } else {
                System.out.println("пошёл в университет");
            }
            //задание 3
        boolean chicken = true;
        boolean vegetables = true;
        boolean sour = true;
        boolean toast = true;
        boolean sausage = false;
        boolean eggs = false;
        if (chicken && vegetables && sour && toast) {
            System.out.println("Повар сделал цезарь");
        } else if (vegetables && sausage || chicken && eggs) {
            System.out.println("Повар сделал оливье");
        } else if (vegetables) {
            System.out.println("Повар сделал овощной салат");
        } else {
            System.out.println("У повара нет ингридиентов");
        }
        //задание 4
// Создать два класса, которые описывают какое либо животное (имеют два атрибута).
        // Написать к ним конструктор, сеттеры, геттеры.
        // Создать экземпляры этих двух животных.

    SvinKing svinutus = new SvinKing("Svinutus", 11);
       PsinaKing gavgavich = new PsinaKing("GavGavich", 1);
        System.out.println(svinutus.name);
        System.out.println(svinutus.number);
        System.out.println(gavgavich.name);
        System.out.println(gavgavich.number);

        }
    }

