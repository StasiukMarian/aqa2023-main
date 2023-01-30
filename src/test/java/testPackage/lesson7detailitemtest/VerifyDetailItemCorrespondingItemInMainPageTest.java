package testPackage.lesson7detailitemtest;

import com.codeborne.selenide.Selenide;
import org.base.BaseTest;
import org.pages.Pages;
import org.pages.item.Item;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class VerifyDetailItemCorrespondingItemInMainPageTest extends BaseTest {
    @Test
    public void test() {
        Pages.loginPage().typeLoginInput("standard_user");
        Pages.loginPage().typePasswordInput("secret_sauce");
        Pages.loginPage().clickEnterButton();

        Selenide.sleep(1000);
        List<Item> itemsFromMainPage = Pages.mainPage().getItems();

        System.out.println(itemsFromMainPage);

        Pages.mainPage().getElementsFromMainPage().get(1).click();
        Selenide.sleep(1000);
        Item itemFromDetailsPage = Pages.itemDetails().getDetailItem();

        System.out.println(itemFromDetailsPage);

        Assert.assertTrue(itemsFromMainPage.contains(itemFromDetailsPage));
    }
}
