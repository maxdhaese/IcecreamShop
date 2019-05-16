package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public interface IceCreamSeller extends Profitable {

    public Cone orderCone(Cone.Flavor[] flavors);
    public IceRocket orderIceRocket();
    public Magnum orderMagnum(Magnum.MagnumType type);
}
