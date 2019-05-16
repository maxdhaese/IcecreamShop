package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamCar implements IceCreamSeller {

    private PriceList priceList;
    private Stock stock;
    private double profit;

    public IceCreamCar(PriceList priceList, Stock stock) {
        this.priceList = priceList;
        this.stock = stock;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] balls) {

        return prepareCone(balls);
    }

    private Cone prepareCone(Cone.Flavor[] balls) {
        int conesInStock = stock.getCones();
        int ballsInStock = stock.getBalls();

        conesInStock -= 1;
        for (int i = 0; i < balls.length; i++) {
            profit += priceList.getBallPrice();
            ballsInStock -= 1;
        }
        stock.setBalls(ballsInStock);
        stock.setCones(conesInStock);


        return new Cone(balls);
    }

    @Override
    public IceRocket orderIceRocket() {
        return prepareIceRocket();
    }

    private IceRocket prepareIceRocket() {
        int rocketsInStock = stock.getIceRockets();

        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType type) {
        return prepareMagnum(type);
    }

    private Magnum prepareMagnum(Magnum.MagnumType type) {
        return new Magnum(type);
    }

    @Override
    public double getProfit() {
        return profit;
    }
}
