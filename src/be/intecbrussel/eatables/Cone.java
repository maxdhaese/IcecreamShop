package be.intecbrussel.eatables;

public class Cone implements Eatable {

    private Flavor[] balls = new Flavor[0];

    //create constructors
    public Cone() {
    }

    public Cone(Flavor[] balls) {
        this.balls = balls;
    }
    //implement eat method for cones. Prints the ball flavours that you picked
    @Override
    public void eat() {
        System.out.println("Eating a cone with flavor/flavors: ");

        for (Flavor ball: balls){
            System.out.println("-" + ball);

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

        //create a toString for the flavors
        @Override
        public String toString() {
            return name().substring(0, 1).toUpperCase() + name().substring(1).toLowerCase();
        }
    }
}
