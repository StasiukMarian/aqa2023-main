package org.pages.shoppingcardpage;

import com.codeborne.selenide.ElementsCollection;
import org.base.PageTools;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$;

public class ShoppingCardPage extends PageTools {
    private final By namesFromShoppingCartItems = By.xpath("//div[@class='inventory_item_name']");

    public List<String> getShoppingCartElementsNames(){
        return getElementsText(namesFromShoppingCartItems);
    }
    public ElementsCollection getShoppingCardItems(){
       return  $$(By.xpath("//div[@class='cart_item']"));
    }


}
