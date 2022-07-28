package homework.homework3;

public abstract class CarFactory extends Car{

    int toyota;
    int jigul;

    public Toyota createToyota() {
        return new Toyota() {
            @Override
            protected Toyota repeat(int i) {
                return null;
            }
        }.repeat(20);


    }

    public Jigul createJigul() {
        return new Jigul() {
        @Override
        protected Jigul repeat(int i) {
            return null;
        }
    }.repeat(20);

    }

}




