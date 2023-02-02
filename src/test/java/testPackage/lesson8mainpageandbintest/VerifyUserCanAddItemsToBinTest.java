package testPackage.lesson8mainpageandbintest;

import com.codeborne.selenide.Selenide;
import org.base.BaseTest;
import org.openqa.selenium.By;
import org.pages.Pages;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;

public class VerifyUserCanAddItemsToBinTest extends BaseTest {

    @Test
    public void test() {
        Pages.loginPage().typeLoginInput("standard_user");
        Pages.loginPage().typePasswordInput("secret_sauce");
        Pages.loginPage().clickEnterButton();

        Selenide.sleep(1000);


//        Pages.mainPage().clickItemByName("Sauce Labs Backpack");
//        Pages.mainPage().clickItemById(1);
//        Selenide.sleep(2000);

        List<String> elementsNamesFromMainPage = Pages.mainPage().getElementsNamesFromMainPage();

        while (Pages.mainPage().getAddToCartList().size()>0){
            $(By.xpath("//button[text()='Add to cart']")).click();
        }
        Pages.mainPage().clickShoppingCartBtn();

        Selenide.sleep(1000);

        List<String> elementsNamesFromShoppingCart = Pages.shoppingCardPage().getShoppingCartElementsNames();

        Assert.assertEquals(elementsNamesFromMainPage,elementsNamesFromShoppingCart);

    }
}
