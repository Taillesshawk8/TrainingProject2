package applications.tricentis.pages;

import Roman.Roman;
import applications.tricentis.widgets.InventoryItem;
import org.openqa.selenium.By;
import selenium.AbstractPage;

public class StorePage extends AbstractPage {
    public StorePage(Roman roman) {
        super(roman);
    }

    @Override
    protected String get_uri() {
        return null;
    }

    @Override
    public boolean waitForDisplayed() {
        return false;
    }

    private final By booksSidebar = By.xpath("//ul[@class=\"list\"]//a[@href=\"/books\"]");
    private final By cartBtn = By.xpath("//span[text()=\"Shopping cart\"]");

    public void clickBooksSidebar(){
        click(booksSidebar);
    }

    public void addToCart(String text){
        InventoryItem item = new InventoryItem();
        click(item.inventoryItem(text));
    }

    public void clickCart(){
        click(cartBtn);
    }
}
