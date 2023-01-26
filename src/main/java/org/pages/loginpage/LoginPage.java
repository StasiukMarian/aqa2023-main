package org.pages.loginpage;

import com.codeborne.selenide.Condition;
import org.base.PageTools;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends PageTools {
    private final By enterBtn = By.xpath("//input[@name='login-button']");
    private final By typeLogin = By.xpath("//input[@placeholder='Username']");
    private final By typePassword = By.xpath("//input[@placeholder='Password']");

    public void typeLoginInput(String login){
        type(login , typeLogin);
    }
    public void typePasswordInput(String password){
        type(password , typePassword);
    }
    public void clickEnterButton(){
       click(enterBtn);
    }
}
