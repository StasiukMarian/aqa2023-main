package org.pages.mainpage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.pages.item.Item;

import java.util.ArrayList;
import java.util.List;


public class MainPage extends Item {
    private final By elementsNames = By.xpath("//div[contains(@class, 'inventory_item_name')]");
    private final By elementByName = By.xpath("//div[text()='%s']");
    private final By elementByID = By.xpath("(//div[@class='inventory_item_name'])[%d]");
    private final By elementsInfos = By.xpath("//div[@class='inventory_item_desc']");
    private final By elementsPrices = By.xpath("//div[@class='inventory_item_price']");
    private final By addToCartButton = By.xpath("//button[text()='Add to cart']");
    private final By shoppingCart = By.xpath("//a[@class='shopping_cart_link']");


    public List<SelenideElement> getElementsFromMainPage(){
        return getElements(elementsNames);
    }
    public List<String> getElementsNamesFromMainPage(){
        return getElementsText(elementsNames);
    }
    public List<SelenideElement> getAddToCartList(){
        return getElements(addToCartButton);
    }
    public void clickShoppingCartBtn(){
        waitForElementVisibility(shoppingCart);
        click(shoppingCart);
    }
    public void clickItemByName(String name){
        waitForElementVisibility(elementByName,name);
        click(elementByName,name);
    }
    public void clickItemById(int id){
        waitForElementVisibility(elementByID,id);
        click(elementByID,id);
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
