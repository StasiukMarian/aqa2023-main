package org.pages.loginpage;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public void typeLoginInput(String login){
        $(By.xpath("//input[@placeholder='Username']")).shouldBe(Condition.visible).append(login);
    }
    public void typePasswordInput(String password){
        $(By.xpath("//input[@placeholder='Password']")).shouldBe(Condition.visible).append(password);
    }
    public void clickEnterButton(){
        $(By.xpath("//input[@type='submit']")).shouldBe(Condition.enabled).click();
    }
}
