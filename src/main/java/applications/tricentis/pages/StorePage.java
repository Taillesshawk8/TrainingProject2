package applications.tricentis.pages;

import Roman.Roman;
import applications.tricentis.models.InventoryItem;
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

    public void clickBooksSidebar(){
        click(booksSidebar);
    }

    public void addToCart(String itemName){
        click(By.xpath("//a[text()='"+itemName+"']//ancestor::div[@class='details']//input"));
    }
}
