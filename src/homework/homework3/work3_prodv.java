package homework.homework3;

public class work3_prodv {

    public static  void main(String[] args) {
        // 1. Создать класс CarFactory, у которого есть два статических метода: создать жигули, создать toyota.
        // 2. Создать 20 тойот, 20 жигулей с помощью CarFactory, положить их в один массив.
        // 3. Пройтись по массиву, проверить к какому классу принадлежит машина, привести тип к классу машины
        // и вызвать характерные для нее методы.
        CarFactory carFactory = new CarFactory() {
            @Override
            protected Toyota repeat(int i) {
                return null;
            }
            @Override
            protected Jigul repeat(int i) {
                return null;
        };;
        Toyota toyota = carFactory.createToyota();
        Jigul jigul = carFactory.createJigul();
        Car[] animals = {cat, horse};

        for (Animal animal : animals) {


    }

}
