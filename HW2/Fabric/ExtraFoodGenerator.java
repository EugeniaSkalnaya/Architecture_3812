package HW2.Fabric;

import HW2.Interface.iGameItem;
import HW2.Product.ExtraFood;

public class ExtraFoodGenerator extends ItemGenerator{

        @Override
        public iGameItem createItem() {
            return new ExtraFood();
        }
    }
