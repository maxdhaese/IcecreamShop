package be.intecbrussel.eatables;

public class Magnum implements Eatable {

    private MagnumType type;

    public Magnum(){

    }

    public Magnum(MagnumType type) {
        this.type = type;
    }

    @Override
    public void eat() {

    }

    public MagnumType getType() {
        return type;
    }

    public enum MagnumType{
        MILKCHOCOLATE("Milkchocolate"),
        WHITECHOCOLATE("Whitechocolate"),
        BLACKCHOCOLATE("Blackchocolate"),
        ALPINENUTS("Alpinenuts"),
        ROMANTICSTRAWBERRIES("Romanticstrawberries");

        private String magnumName;

        MagnumType(String magnumName) {
            this.magnumName = magnumName;
        }
    }
}
