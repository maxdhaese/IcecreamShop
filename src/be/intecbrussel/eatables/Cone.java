package be.intecbrussel.eatables;

public class Cone implements Eatable {

    private Flavor[] balls = new Flavor[7];

    public Cone() {
    }

    public Cone(Flavor[] balls) {
        this.balls = balls;
    }

    @Override
    public void eat() {

    }

    public enum Flavor {
        STRAWBERRY,
        BANANA,
        CHOCOLATE,
        VANILLA,
        LEMON,
        STRACIATELLA,
        MOKKA,
        PISTACHE;

        @Override
        public String toString() {
            return name().substring(0, 1).toUpperCase() + name().substring(1).toLowerCase();
        }
    }
}
