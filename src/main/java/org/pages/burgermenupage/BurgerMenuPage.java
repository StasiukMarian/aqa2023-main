package org.pages.burgermenupage;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BurgerMenuPage {
    public void clickAllItemsBurgerMenuItem(){
        $(By.xpath("//a[@id='inventory_sidebar_link']")).shouldBe(Condition.enabled).click();
    }
    public void clickAboutBurgerMenuItem(){
        $(By.xpath("//a[@id='about_sidebar_link']")).shouldBe(Condition.enabled).click();
    }
    public void clickLogoutBurgerMenuItem(){
        $(By.xpath("//a[@id='logout_sidebar_link']")).shouldBe(Condition.enabled).click();
    }
    public void clickResetAppStateBurgerMenuItem(){
        $(By.xpath("//a[@id='reset_sidebar_link']")).shouldBe(Condition.enabled).click();
    }
}
