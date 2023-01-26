package org.base;

import com.codeborne.selenide.*;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class PageTools extends CustomLogger{

    private static String getPreviousMethodNameAsText() {
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        String replacedName = methodName.replaceAll(
                String.format("%s|%s|%s",
                        "(?<=[A-Z])(?=[A-Z][a-z])",
                        "(?<=[^A-Z])(?=[A-Z])",
                        "(?<=[A-Za-z])(?=[^A-Za-z])"
                ),
                " "
        );
        return replacedName.substring(0, 1).toUpperCase() + replacedName.substring(1).toLowerCase();
    }
    public By byLocator (By by , Object... args){
        return LocatorParser.parseLocator(by , args);
    }
    /*
    * get
    * */
    protected SelenideElement getSelenideElement(By by , Object... args){
        return $(byLocator(by , args));
    }
    protected Actions getActions(){
        return Selenide.actions();
    }
    /*
    * SHOULD BE*/

    protected SelenideElement shouldBe(Condition condition , By by , Object... args){
        return $(byLocator(by,args)).shouldBe(condition);
    }
    protected ElementsCollection shouldBe(CollectionCondition condition , By by, Object... args){
        return $$(byLocator(by , args)).shouldBe(condition);
    }
    /*
    * Should have
    * */
    protected SelenideElement shouldHave(Condition condition , By by , Object... args){
        return $(byLocator(by , args)).shouldHave(condition);
    }
    protected ElementsCollection shouldHave(CollectionCondition condition , By by , Object... args){
        return $$(byLocator(by, args)).shouldHave(condition);
    }

    /*
    * Main Actions
    * */

    protected void click( By by , Object... args){
        logInfo(getPreviousMethodNameAsText() + " ', element -> " + byLocator(by , args));
        shouldBe(Condition.visible, by , args).click();
    }
    protected void type (String text , By by  , Object... args){
        logInfo(getPreviousMethodNameAsText() +" " + text + " ', element -> " + byLocator(by , args));
        shouldBe(Condition.visible , by , args).append(text);
    }
}
