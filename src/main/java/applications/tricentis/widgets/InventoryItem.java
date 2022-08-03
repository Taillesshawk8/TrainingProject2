package applications.tricentis.widgets;

import org.openqa.selenium.By;

public class InventoryItem {
    public By inventoryItem(String itemName){
        return By.xpath("//a[text()='"+itemName+"']//ancestor::div[@class='details']//input");
    }
}
