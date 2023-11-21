package HW2.Fabric;

import HW2.Interface.iGameItem;
import HW2.Product.MagicWeapon;

public class MagicWeaponGenerator extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new MagicWeapon();
    }

}
