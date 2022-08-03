package applications.tricentis.pages;

import Roman.Roman;
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

    public boolean checkCart(){
        try {
            return _driver.findElement(cartEmpty).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void removeItem(){
        click(removeBtn);
        click(updateBtn);
    }
}
