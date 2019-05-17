package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamCar implements IceCreamSeller {

    private PriceList priceList;
    private Stock stock;
    private double profit;

    //Create a constructor for IceCreamCar
    public IceCreamCar(PriceList priceList, Stock stock) {
        this.priceList = priceList;
        this.stock = stock;
    }

    //implement all the methods from IceCreamSeller and add a prepareMethod for each eatable.
    //Throw a NoMoreIceCreamException for every method because we have to check if the eatables that are ordered are still in stock.
    @Override
    public Cone orderCone(Cone.Flavor[] balls) throws NoMoreIceCreamException {
        //when a client orders iceCreams, the seller is going to prepare the icecreams and maybe notice that there are no more balls/cones left so that's why I implement the prepare method
        //and return the method here.

        return prepareCone(balls);
    }

    private Cone prepareCone(Cone.Flavor[] balls) throws NoMoreIceCreamException {
        int conesInStock = stock.getCones();
        int ballsInStock = stock.getBalls();
        //check if there are enough cones left in the stock. If the conesInstock is 0 or lower we will get an exception.
        if (conesInStock <= 0) {
            throw new NoMoreIceCreamException("Sorry, there are no more cones left...");
        } else {
            //if there are enough cones left, 1 cone is being removed out of the stock.
            conesInStock -= 1;
        }
        //do the same for the balls. Not enough balls => NoMoreIceCreamException and give a message.
        if (ballsInStock <= 0) {
            throw new NoMoreIceCreamException("Sorry, there are no more balls left...");
        } else {
            //if there are enough balls the profit is raised
            for (int i = 0; i < balls.length; i++) {
                profit += priceList.getBallPrice();
                ballsInStock -= 1;
            }
        }
        //Edit the change of the stock in stock.setBalls and stock.setCones
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
        //if there are not enough ice rockets there will be a NoMoreIceCreamException and a message.
        if (rocketsInStock <= 0) {
            throw new NoMoreIceCreamException("Sorry, we ran out of ice rockets");
        } else {
            //In case there are enough ice rockets for the order, the stock lowers.
            rocketsInStock--;
            profit += priceList.getRocketPrice();

        }
        //set the new stock of ice rockets
        stock.setIceRockets(rocketsInStock);

        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType type) throws NoMoreIceCreamException {
        return prepareMagnum(type);
    }

    private Magnum prepareMagnum(Magnum.MagnumType type) throws NoMoreIceCreamException {
        int magnumsInStock = stock.getMagni();
        //check if there are enough magni for the order. If not we get a NoMoreIceCreamException and a message.
        if (magnumsInStock <= 0) {
            throw new NoMoreIceCreamException("Sorry, we ran out of magni..");
        } else {
            //in case there are enough magni left the stock is lowered.
            magnumsInStock--;
            profit += priceList.getMagnumPrice(type);

        }
        //set the new stock of magni
        stock.setMagni(magnumsInStock);

        return new Magnum(type);
    }

    @Override
    public double getProfit() {
        return profit;
    }
}
