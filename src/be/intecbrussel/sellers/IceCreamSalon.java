package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamSalon implements IceCreamSeller {

    private PriceList priceList;
    private double totalProfit = 0;

    //create constructor for the IceCreamSalon
    public IceCreamSalon(PriceList priceList) {
        this.priceList = priceList;
    }

    //implement the methods for IceCreamSalon
    @Override
    public Cone orderCone(Cone.Flavor[] flavors) {
        //totalProfit raises with every ball picked. A ballprice is added for every ball.
        totalProfit += priceList.getBallPrice()*flavors.length;
        return new Cone(flavors);

    }

    @Override
    public IceRocket orderIceRocket() {
        //totalProfit raises with every IceRocket picked
        totalProfit += priceList.getRocketPrice();
        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType type) {
        //totalProfit raises with every magnum picked
        totalProfit += priceList.getMagnumPrice(type);
        return new Magnum(type);
    }
    //returns the totalProfit
    @Override
    public double getProfit() {
        return totalProfit;
    }
}
