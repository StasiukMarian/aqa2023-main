package org.pages.shoppingcardpage;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public class ShoppingCardPage {

    public ElementsCollection getShoppingCardItems(){
       return  $$(By.xpath("//div[@class='cart_item']"));
    }
}
