package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.NoMoreIceCreamException;
import be.intecbrussel.sellers.PriceList;

public class IceCreamApp {
    public static void main(String[] args) throws NoMoreIceCreamException {


        //create objects for PriceList and IceCreamSalon
        PriceList priceList = new PriceList(0.5,1.5,2);
        IceCreamSeller iceCreamSeller = new IceCreamSalon(priceList);
        //fill an array of eatables with diff types of ice creams
        Eatable[] eatables = {
                iceCreamSeller.orderMagnum(Magnum.MagnumType.BLACKCHOCOLATE),
                iceCreamSeller.orderIceRocket(),
                iceCreamSeller.orderCone(new Cone.Flavor[]{Cone.Flavor.PISTACHE, Cone.Flavor.STRAWBERRY})};
        //run through the array and print the eat method for each item
        for (Eatable iceSalon: eatables)
            iceSalon.eat();
        

        //print the profit made
        System.out.println("The profit is : € " + iceCreamSeller.getProfit());





    }
}
