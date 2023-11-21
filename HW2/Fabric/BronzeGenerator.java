package HW2.Fabric;

import HW2.Interface.iGameItem;
import HW2.Product.Bronze;


public class BronzeGenerator extends ItemGenerator {

        @Override
        public iGameItem createItem() {
            return new Bronze();
        }
    }
