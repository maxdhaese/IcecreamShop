package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Magnum;

public class PriceList {

    private double ballPrice = 0.5;
    private double rocketPrice = 1.5;
    private double magnumStandardPrice = 2;

    public PriceList() {
    }

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getBallPrice() {
        return ballPrice;
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }


    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getMagnumPrice(Magnum.MagnumType type) {
        switch (type){
            case MILKCHOCOLATE:
            case BLACKCHOCOLATE:
            case WHITECHOCOLATE:
                magnumStandardPrice *= 1;
                break;
            case ALPINENUTS:
                magnumStandardPrice *= 1.5;
                break;
            case ROMANTICSTRAWBERRIES:
                magnumStandardPrice *= 1.7;
                break;
        }


        return magnumStandardPrice;
    }
}
