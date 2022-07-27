package applications.saucedemo.pages;

import Roman.Roman;
import applications.saucedemo.widgets.InventoryItemWidget;
import selenium.AbstractPage;

public class InventoryPage extends AbstractPage {
    private Roman roman;

    public InventoryPage(Roman roman) {
        super(roman);
        this.roman = roman;
    }

    public void addItemToCart(String itemName){
        InventoryItemWidget backpack = new InventoryItemWidget(roman,itemName);
        backpack.addToCart();
    }

    public void addItemToCart(String[] itemNames){
        for(String item : itemNames)
        {
            InventoryItemWidget backpack = new InventoryItemWidget(roman,item);
            backpack.addToCart();
        }
    }

    @Override
    protected String get_uri() {
        return null;
    }

    @Override
    public boolean waitForDisplayed() {
        return false;
    }
}
