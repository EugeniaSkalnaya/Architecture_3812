package HW2.Fabric;

import HW2.Interface.iGameItem;
import HW2.Product.Silver;

public class SilverGenerator extends ItemGenerator{
        @Override
        public iGameItem createItem() {
            return new Silver();
        }

    }

