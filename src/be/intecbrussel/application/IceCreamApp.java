package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.PriceList;

public class IceCreamApp {
    public static void main(String[] args) {



        PriceList priceList = new PriceList(0.5,1.5,2);
        IceCreamSeller iceCreamSeller = new IceCreamSalon(priceList);
        Eatable magnum = iceCreamSeller.orderMagnum(Magnum.MagnumType.BLACKCHOCOLATE);
        Eatable rocket = iceCreamSeller.orderIceRocket();
        Eatable cone = iceCreamSeller.orderCone(new Cone.Flavor[]{Cone.Flavor.PISTACHE, Cone.Flavor.STRAWBERRY});

        magnum.eat();
        cone.eat();
        rocket.eat();

        System.out.println("The profit is : € " + iceCreamSeller.getProfit());





    }
}
