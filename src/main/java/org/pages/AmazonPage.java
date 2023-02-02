package org.pages;

import com.codeborne.selenide.Selenide;
import org.base.PageTools;
import org.openqa.selenium.By;

public class AmazonPage extends PageTools {
    private final By dropDownElement = By.xpath("//div[@id='nav-search-dropdown-card']");
    private final By dropDownItem = By.xpath("//option[@value='%s']");

    public void selectDropDownItemByName (String name){
        click(dropDownElement);
        Selenide.sleep(500);
        click(dropDownItem, name);
    }
}
