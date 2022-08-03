package applications.tricentis.models;

import org.openqa.selenium.By;

public class InventoryItem {
    public By productName(String itemName){
        return By.xpath("//a[text()='"+itemName+"']//ancestor::div[@class='details']//input");
    }
}
