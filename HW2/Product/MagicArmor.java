package HW2.Product;

import HW2.Interface.iGameItem;

public class MagicArmor implements iGameItem {

    @Override
    public void open() {
        System.out.println("Magic Armor!");
    }

}