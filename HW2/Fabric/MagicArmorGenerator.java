package HW2.Fabric;

import HW2.Interface.iGameItem;
import HW2.Product.MagicArmor;

public class MagicArmorGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new MagicArmor();
    }
}
