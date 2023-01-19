package org.base;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;
public class BaseTest {

    @BeforeClass(alwaysRun = true, description = "Creating configs for our tests")
    public void configuration(){
        com.codeborne.selenide.Configuration.holdBrowserOpen = true;
        com.codeborne.selenide.Configuration.startMaximized = true;
//        Configuration.browserSize = "1920x1080";
        com.codeborne.selenide.Configuration.screenshots = true;
        com.codeborne.selenide.Configuration.headless = false;
        com.codeborne.selenide.Configuration.pageLoadStrategy = "normal";
        com.codeborne.selenide.Configuration.pageLoadTimeout = 20000;
        Configuration.timeout = 10000;
    }
    @BeforeMethod(alwaysRun = true, description = "Opening base URL")
    public void setUp(){
        Selenide.open("https://www.saucedemo.com/");
    }
//    https://www.saucedemo.com/ - TEST WEB-SITE
// https://www.stats.govt.nz/large-datasets/csv-files-for-download/ - URL TO DOWNLOAD FILE
//    https://ps.uci.edu/~franklin/doc/file_upload.html - URL TO UPLOAD FILE
    @AfterMethod(alwaysRun = true, description = "Web Driver cleanup")
    public void cleanWebDriver(){
        Selenide.clearBrowserCookies();
        Selenide.refresh();
        Selenide.open("about:blank");
    }
    @AfterSuite(alwaysRun = true, description = "Closing Web Browser")
    public void tearDown(){
        Selenide.closeWebDriver();
    }
}
