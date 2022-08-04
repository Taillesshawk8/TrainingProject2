package applications.tricentis.pages;

import Roman.Roman;
import applications.tricentis.widgets.InventoryItem;
import org.openqa.selenium.By;
import selenium.Selenium;

public class CartPage extends Selenium {
    public CartPage(Roman roman) {
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


    private final By cartQty = By.xpath("//span[@class='cart-qty']");
    private final By cartEmpty = By.xpath("//div[contains(text(),'empty')]");
    private final By removeBtn = By.xpath("//input[@name='removefromcart']");
    private final By updateBtn = By.xpath("//input[@name='updatecart']");

    public boolean isCartEmpty(){
        try {
            return _driver.findElement(cartEmpty).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public int cartCount(){
        var quantity = _driver.findElement(cartQty).getText();
        return Integer.parseInt(quantity.replace("(","").replace(")",""));
    }

    public void removeItem(String itemName){
        click(removeBtn);
        click(updateBtn);
    }

    public void clearCart(){
        while(cartCount() != 0){
            click(removeBtn);
            click(updateBtn);
        }System.out.println("Cleared cart");
    }
}
