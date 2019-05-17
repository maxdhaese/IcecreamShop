package be.intecbrussel.eatables;

public class Magnum implements Eatable {

    private MagnumType type;

    //create constructors
    public Magnum() {

    }

    public Magnum(MagnumType type) {
        this.type = type;
    }

    //implement eat method for magni. prints the type you picked.
    @Override
    public void eat() {
        System.out.println("Eating a " + getType() + " magnum");


    }

    public MagnumType getType() {
        return type;
    }

    public enum MagnumType {
        MILKCHOCOLATE("milk chocolate"),
        WHITECHOCOLATE("white chocolate"),
        BLACKCHOCOLATE("black chocolate"),
        ALPINENUTS("alpine nuts"),
        ROMANTICSTRAWBERRIES("romantic strawberries");

        private String magnumName;
        //create a constructor for magni so i can add a string to the types.
        MagnumType(String magnumName) {
            this.magnumName = magnumName;
        }

        @Override
        public String toString() {
            return  magnumName;

        }
//
//        @Override
//        public String toString() {
//            return name().substring(0, 1).toUpperCase() + name().substring(1).toLowerCase();
//        }
    }
}
