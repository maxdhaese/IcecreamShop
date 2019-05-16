package be.intecbrussel.eatables;

public class Cone implements Eatable {

    private Flavor[] balls = new Flavor[0];

    public Cone() {
    }

    public Cone(Flavor[] balls) {
        this.balls = balls;
    }

    @Override
    public void eat() {
        System.out.println("Eating a cone with flavor/flavors: ");

        for (Flavor ball: balls){
            System.out.println(ball + " ");

        }


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
