package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public interface IceCreamSeller extends Profitable {
    //create abstract methods that can be implemented later by iceCreamCar and iceCreamSalon
    public Cone orderCone(Cone.Flavor[] flavors) throws NoMoreIceCreamException;
    public IceRocket orderIceRocket() throws NoMoreIceCreamException;
    public Magnum orderMagnum(Magnum.MagnumType type) throws NoMoreIceCreamException;
}
