package HW2.Fabric;


import HW2.Interface.iGameItem;
import HW2.Product.Gold;

public class GoldGenerator extends ItemGenerator {

        @Override
        public iGameItem createItem() {
            return new Gold();
        }

    }
