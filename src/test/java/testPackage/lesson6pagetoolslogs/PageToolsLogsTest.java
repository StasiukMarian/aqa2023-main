package testPackage.lesson6pagetoolslogs;

import org.base.BaseTest;
import org.pages.Pages;
import org.testng.annotations.Test;

public class PageToolsLogsTest extends BaseTest {
    @Test
    public void test(){
        Pages.loginPage().typeLoginInput("standard_user");
        Pages.loginPage().typePasswordInput("secret_sauce");

    }
}
