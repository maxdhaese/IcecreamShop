package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamCar;
import be.intecbrussel.sellers.NoMoreIceCreamException;
import be.intecbrussel.sellers.PriceList;
import be.intecbrussel.sellers.Stock;

public class IceCreamAppV2 {
    public static void main(String[] args) {

        PriceList priceList = new PriceList(0.5,1.5,2);
        Stock stock = new Stock(1,3,4,5);
        IceCreamCar iceCreamCar = new IceCreamCar(priceList,stock);


        try {
            Eatable[] eatables = {
                    iceCreamCar.orderMagnum(Magnum.MagnumType.BLACKCHOCOLATE),
                    iceCreamCar.orderIceRocket(),
                    iceCreamCar.orderIceRocket(),
                    iceCreamCar.orderCone(new Cone.Flavor[]{Cone.Flavor.PISTACHE, Cone.Flavor.STRAWBERRY})};
            for (Eatable iceSalon: eatables)
                iceSalon.eat();
            
        } catch (NoMoreIceCreamException e) {
            e.printStackTrace();
        }finally {
            System.out.println("The profit is : € " + iceCreamCar.getProfit());
        }





    }
}
