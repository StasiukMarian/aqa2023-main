package org.pages.footernavigationpage;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FooterNavigationPage {

    public void clickTwitterItem() {
        $(By.xpath("//ul[@class='social']/li[@class='social_twitter']")).shouldBe(Condition.enabled).click();
    }

    public void clickFacebookItem() {
        $(By.xpath("//ul[@class='social']/li[@class='social_facebook']")).shouldBe(Condition.enabled).click();
    }

    public void clickLinkedInItem() {
        $(By.xpath("//ul[@class='social']/li[@class='social_linkedin']")).shouldBe(Condition.enabled).click();
    }
}
