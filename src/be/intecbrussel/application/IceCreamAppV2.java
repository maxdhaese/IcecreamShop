package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.*;

public class IceCreamAppV2 {
    public static void main(String[] args) {
        //create objects from PriceList, Stock and IceCreamCar
        PriceList priceList = new PriceList(0.5,1.5,2);
        Stock stock = new Stock(2,5,5,2);
        IceCreamSeller iceCreamSeller = new IceCreamCar(priceList,stock);

        //fill an array of Eatables with different types of iceCreams(magni, ice rocktes, cones with balls...)
        //We have to run a NoMoreIceCreamException on the order because maybe there are not enough items left in stock.


        Eatable[] eatables = new Eatable[0];
        try {
            eatables = new Eatable[]{
                    iceCreamSeller.orderMagnum(Magnum.MagnumType.BLACKCHOCOLATE),
                    iceCreamSeller.orderCone(new Cone.Flavor[]{Cone.Flavor.PISTACHE, Cone.Flavor.STRAWBERRY}),
                    iceCreamSeller.orderIceRocket(),
                    iceCreamSeller.orderIceRocket(),
                    iceCreamSeller.orderIceRocket()};
            for (Eatable iceSalon: eatables)
                iceSalon.eat();
            System.out.println("The profit is : € " + iceCreamSeller.getProfit());
        } catch (NoMoreIceCreamException e) {
            System.out.println(e.getMessage());
        }
        //run through the array of eatables and print the eat method for each item in the array.

        //If we get a NoMoreIceCreamException we will send a message. In this case the client ordered more ice rockets than the stock counts so we get an exception saying "we ran out of ice rocktes"
        //when we change the stock of ice rockets to 3 or more there will be no exception and the program will run.












    }
}
