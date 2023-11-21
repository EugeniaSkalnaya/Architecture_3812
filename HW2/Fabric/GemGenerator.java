package HW2.Fabric;

import HW2.Interface.iGameItem;
import HW2.Product.Gem;

public class GemGenerator extends ItemGenerator {

        @Override
        public iGameItem createItem() {
            return new Gem();
        }

    }
