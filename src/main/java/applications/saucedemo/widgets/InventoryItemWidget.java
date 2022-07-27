package applications.saucedemo.widgets;

import Roman.Roman;
import org.openqa.selenium.By;
import selenium.AbstractWidget;

public class InventoryItemWidget extends AbstractWidget {

    private By addToCartBtn = By.xpath(".//button[text()='Add to cart']");
    private By itemPrice = By.xpath(".//div[@class='inventory_item_price']");


    public InventoryItemWidget(Roman roman, String itemName) {
        super(roman);
        this.itemName = itemName;
    }
    private String itemName;

    public void addToCart(){
        click(addToCartBtn);
    }

    public String price(){
        return getText(itemPrice);
    }

    @Override
    protected By _Locator() {
        return By.xpath("//div[text()='"+itemName+"']//ancestor::div[@class='inventory_item']");
    }

    @Override
    public boolean waitForDisplayed() {
        return false;
    }
}
