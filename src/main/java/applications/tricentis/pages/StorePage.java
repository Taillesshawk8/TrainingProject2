package applications.tricentis.pages;

import Roman.Roman;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import selenium.Selenium;

public class StorePage extends Selenium {
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
    private final By addToCartComAndInt = By.xpath("//div[@data-productid=\"13\"]//input");


    public void addComAndIntToCart(){
        click(booksSidebar);
        click(addToCartComAndInt);
    }
}
