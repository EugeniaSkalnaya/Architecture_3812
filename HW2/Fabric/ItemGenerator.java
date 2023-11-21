package HW2.Fabric;


import HW2.Interface.iGameItem;

public abstract class ItemGenerator {
        public abstract iGameItem createItem();

        public void openReward()
        {
            createItem().open();
        }
    }
