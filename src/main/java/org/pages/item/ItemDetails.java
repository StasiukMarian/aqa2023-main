package org.pages.item;

import org.openqa.selenium.By;

public class ItemDetails extends Item{

    private final By detailItemName = By.xpath("//div[contains(@class, 'inventory_details_name')]");
    private final By detailItemInfo = By.xpath("(//div[contains(@class, 'inventory_details_desc')])[2]");
    private final By detailItemPrice = By.xpath("//div[contains(@class, 'inventory_details_price')]");

    public Item getDetailItem(){
        String elementName = getElementText(detailItemName);
        String elementInfo = getElementText(detailItemInfo);
        String elementPrice = getElementText(detailItemPrice);
        Item item = new Item();
        item.setItemName(elementName);
        item.setItemInfo(elementInfo);
        item.setItemPrice(elementPrice);
        return item;
    }
}
