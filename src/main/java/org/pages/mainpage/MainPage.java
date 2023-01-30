package org.pages.mainpage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.pages.item.Item;

import java.util.ArrayList;
import java.util.List;


public class MainPage extends Item {
    private final By elementsNames = By.xpath("//div[contains(@class, 'inventory_item_name')]");
    private final By elementsInfos = By.xpath("//div[@class='inventory_item_desc']");
    private final By elementsPrices = By.xpath("//div[@class='inventory_item_price']");

    public List<SelenideElement> getElementsFromMainPage(){
        return getElements(elementsNames);
    }
    public List<Item> getItems(){
      List<Item> itemList = new ArrayList<>();
        List<SelenideElement> elements = getElements(elementsNames);
        List<String> namesText = getElementsText(elementsNames);
        List<String> infosText = getElementsText(elementsInfos);
        List<String> pricesText = getElementsText(elementsPrices);
        for (int i = 0; i < elements.size(); i++) {
            Item item = new Item();
            item.setItemName(String.valueOf(namesText.get(i)));
            item.setItemInfo(String.valueOf(infosText.get(i)));
            item.setItemPrice(String.valueOf(pricesText.get(i)));
            itemList.add(item);
        }
        return itemList;
    }
}
