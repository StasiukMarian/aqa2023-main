package testPackage.lesson6pagetoolslogs;

import com.codeborne.selenide.Selenide;
import org.base.BaseTest;
import org.pages.Pages;
import org.testng.annotations.Test;

public class PageToolsLogsTest extends BaseTest {
    @Test
    public void test(){
        Pages.loginPage().typeLoginInput("standard_user");
        Pages.loginPage().typePasswordInput("secret_sauce");
        Pages.loginPage().clickEnterButton();
        Selenide.sleep(3000);
    }
}
