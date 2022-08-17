package applications.tricentis.widgets;

import Roman.Roman;
import org.openqa.selenium.By;
import selenium.AbstractWidget;

public class InventoryItem extends AbstractWidget {

    private final String itemName;
    private final By addToCartBtn = By.xpath(".//input");

    public InventoryItem(Roman roman, String itemName) {
        super(roman);
        this.itemName = itemName;
    }

    public void addToCart(){
        click(addToCartBtn);
    }

    @Override
    protected By _Locator() {
        return By.xpath("//a[text()='"+itemName+"']/ancestor::div[@class='item-box']");
    }

    @Override
    public boolean waitForDisplayed() {
        return true;
    }
}
