package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.sellers.IceCreamCar;
import be.intecbrussel.sellers.NoMoreIceCreamException;
import be.intecbrussel.sellers.PriceList;
import be.intecbrussel.sellers.Stock;

public class IceCreamAppV2 {
    public static void main(String[] args) {

        PriceList priceList = new PriceList(0.5,1.5,2);
        Stock stock = new Stock(0,0,0,0);
        IceCreamCar iceCreamCar = new IceCreamCar(priceList,stock);

        try {
            iceCreamCar.orderCone(new Cone.Flavor[]{Cone.Flavor.STRAWBERRY});
        } catch (NoMoreIceCreamException e) {
            e.printStackTrace();
        }
    }
}
