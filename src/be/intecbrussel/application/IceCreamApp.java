package be.intecbrussel.application;

import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.PriceList;

public class IceCreamApp {

    PriceList priceList = new PriceList();
    IceCreamSalon iceCreamSalon = new IceCreamSalon(priceList);
}
