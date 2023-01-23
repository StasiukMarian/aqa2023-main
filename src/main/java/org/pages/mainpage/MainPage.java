package org.pages.mainpage;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public void clickBurgerMenu(){
        $(By.xpath("//button[@id='react-burger-menu-btn']")).shouldBe(Condition.enabled).click();
    }
    public void clickDropDownFilterMenu(){
        $(By.xpath("//select[@class='product_sort_container']")).shouldBe(Condition.enabled).click();
    }
    public void clickShoppingCardButton(){
        $(By.xpath("//a[@class='shopping_cart_link']")).shouldBe(Condition.enabled).click();
    }
}
