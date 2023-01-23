package org.pages.dropdownfiltermenupage;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DropDownFilterMenuPage {

    public void selectFilterItemFromAtoZ(){
        $(By.xpath("//option[1]")).shouldBe(Condition.enabled).click();
    }
    public void selectFilterItemFromZtoA(){
        $(By.xpath("//option[2]")).shouldBe(Condition.enabled).click();
    }
    public void selectFilterItemFromLowToHigh(){
        $(By.xpath("//option[3]")).shouldBe(Condition.enabled).click();
    }
    public void selectFilterItemFromHighToLow(){
        $(By.xpath("//option[4]")).shouldBe(Condition.enabled).click();
    }
}
