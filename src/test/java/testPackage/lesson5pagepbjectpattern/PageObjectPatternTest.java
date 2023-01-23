package testPackage.lesson5pagepbjectpattern;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.pages.Pages;
import org.pages.dropdownfiltermenupage.DropDownFilterMenuPage;
import org.pages.loginpage.LoginPage;
import org.pages.mainpage.MainPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

import static com.codeborne.selenide.Selenide.$;

public class PageObjectPatternTest extends BaseTest {
//    LoginPage loginPage;
//    MainPage mainPage;
//    DropDownFilterMenuPage dropDownFilterMenuPage;

    //    @BeforeMethod
//    public void prepareVariables (){
//        loginPage = new LoginPage();
//        mainPage = new MainPage();
//        dropDownFilterMenuPage = new DropDownFilterMenuPage();
//    }
    @Test
    public void test() {
        Pages.loginPage().typeLoginInput("standard_user");
        Pages.loginPage().typePasswordInput("secret_sauce");
        Pages.loginPage().clickEnterButton();

        $(By.xpath("(//button[text()='Add to cart'])[1]")).shouldBe(Condition.enabled).click();
        Pages.mainPage().clickShoppingCardButton();
        Assert.assertTrue(Pages.shoppingCardPage().getShoppingCardItems().size() > 0);
//        Pages.mainPage().clickDropDownFilterMenu();
//        Pages.dropDownFilterMenuPage().selectFilterItemFromHighToLow();
//        Pages.footerNavigationPage().clickTwitterItem();
//        Selenide.switchTo().window(1);
//        Selenide.sleep(5000);
//        Assert.assertTrue($(By.xpath("//h1[@role='heading']//div[@dir='ltr']")).is(Condition.exist));
//        WebDriver webDriver = WebDriverRunner.getWebDriver();
//        Set<String> windowHandles = webDriver.getWindowHandles();
//        Selenide.switchTo().window(0);
//        Selenide.switchTo().defaultContent();

//        System.out.println(windowHandles);
        //        Assert.assertTrue($(By.xpath("(//div[@class='inventory_item_description']//div[@class='inventory_item_price'])[1]")).text().contains("49.99") );
    }
}
