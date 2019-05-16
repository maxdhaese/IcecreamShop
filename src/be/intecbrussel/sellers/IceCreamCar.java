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
    public Cone orderCone(Cone.Flavor[] balls) throws NoMoreIceCreamException {

        return prepareCone(balls);
    }

    private Cone prepareCone(Cone.Flavor[] balls)throws NoMoreIceCreamException {
        int conesInStock = stock.getCones();
        int ballsInStock = stock.getBalls();

        if (conesInStock <= 0){
            throw new NoMoreIceCreamException("Sorry, there are no more cones left...");
        } else {
            conesInStock -= 1;
        }
        if (ballsInStock <= 0) {
            throw new NoMoreIceCreamException("Sorry, there are no more balls left...");
        }else {
            for (int i = 0; i < balls.length; i++) {
                profit += priceList.getBallPrice();
                ballsInStock -= 1;
            }
        }

        stock.setBalls(ballsInStock);
        stock.setCones(conesInStock);


        return new Cone(balls);
    }

    @Override
    public IceRocket orderIceRocket() throws NoMoreIceCreamException {
        return prepareIceRocket();
    }

    private IceRocket prepareIceRocket() throws NoMoreIceCreamException {
        int rocketsInStock = stock.getIceRockets();

        if (rocketsInStock <= 0) {
            throw new NoMoreIceCreamException("Sorry, wer ran out of ice rockets");
        }else {
            rocketsInStock--;
            profit += priceList.getRocketPrice();

        }
        stock.setIceRockets(rocketsInStock);

        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType type) throws NoMoreIceCreamException {
        return prepareMagnum(type);
    }

    private Magnum prepareMagnum(Magnum.MagnumType type) throws NoMoreIceCreamException {
        int magnumsInStock = stock.getMagni();

        if (magnumsInStock <= 0){
            throw new NoMoreIceCreamException("Sorry, we ran out of magni..");
        }else {
            magnumsInStock--;
            profit += priceList.getMagnumPrice(type);

        }
        stock.setMagni(magnumsInStock);

        return new Magnum(type);
    }

    @Override
    public double getProfit() {
        return profit;
    }
}
