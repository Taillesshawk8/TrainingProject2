package applications.tricentis.pages;

import Roman.Roman;
import applications.tricentis.widgets.InventoryItem;
import org.openqa.selenium.By;
import selenium.AbstractPage;

public class StorePage extends AbstractPage {

    private final Roman roman;

    private final By booksSidebar = By.xpath("//ul[@class='list']//a[@href='/books']");

    private final By cartBtn = By.xpath("//span[text()='Shopping cart']");

    public StorePage(Roman roman) {
        super(roman);
        this.roman = roman;
    }

    public void addItemToCart(String item) {
        InventoryItem inv = new InventoryItem(roman, item);
        inv.addToCart();
        navigateTo();
    }

    public void addItemToCart(String[] items){
        for(String item : items) {
            InventoryItem inv = new InventoryItem(roman,item);
            inv.addToCart();
        } navigateTo();
    }

    public void goToBooks(){
        click(booksSidebar);
    }

    public void goToCart(){
        click(cartBtn);
    }

    @Override
    protected String get_uri() {
        return "http://demowebshop.tricentis.com/";
    }

    @Override
    public boolean waitForDisplayed() {
        return false;
    }
}