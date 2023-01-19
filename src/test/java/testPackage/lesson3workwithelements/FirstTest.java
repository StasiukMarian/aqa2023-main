package testPackage.lesson3workwithelements;

import com.codeborne.selenide.Condition;
import org.base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FirstTest extends BaseTest {

//    @BeforeClass
//    public void setUpDownloadFile(){
//        Configuration.reportsFolder = "downloads";
//        Configuration.fileDownload = FileDownloadMode.FOLDER;
//    }
    public static String getFilePathByName(String fileName){
        return new File("src/main/resources/files/" + fileName).getAbsolutePath();
    }
    @Test
    public void test() throws FileNotFoundException {
//        $(By.xpath("//input[1]")).uploadFile(new File(getFilePathByName("annual-enterprise-survey-2021-financial-year-provisional-csv.csv")));
//        Selenide.sleep(3000);
//        $(By.xpath("//input[@placeholder='Username']")).append("standard_user");
//        $(By.xpath("//input[@placeholder='Password']")).append("secret_sauce");
//        $(By.xpath("//input[@placeholder='Username']")).clear();
//        $(By.xpath("//input[@type='submit']")).click();
//        $(By.xpath("(//h3[@class='block-document__title']//a)[1]")).scrollIntoView(true);
//        Selenide.sleep(2000);
//
//        try {
//            File download = $(By.xpath("(//h3[@class='block-document__title']//a)[1]")).download();
//            String path = download.getPath();
//            FileUtils.deleteDirectory(new File("downloads"));
//        } catch (IOException e) {
//            e.printStackTrace();
//
//        }


//        $(By.xpath("xpath")).doubleClick();
//        $(By.xpath("//input[@id='twotabsearchtextbox']")).append("Java");
//        Selenide.actions().sendKeys(Keys.ENTER).perform();
//        Selenide.sleep(1000);
//        $(By.xpath("//select[@class='product_sort_container']")).click();
//        Selenide.actions().sendKeys(Keys.ESCAPE).perform();
//        Selenide.actions().keyDown($(By.xpath("xpath from element")),Keys.SHIFT).perform();
//        Selenide.actions().keyUp($(By.xpath("To element target")),Keys.SHIFT).perform();

//        Selenide.actions().dragAndDrop($(By.xpath("source element")),$(By.xpath("target element")));
//        Selenide.actions().dragAndDropBy($(By.xpath("element")),200, 0);

//        $(By.xpath("//nav[@class='nav-menu']//div[contains(@class, 'nav-menu-has-children')]")).hover();
//        System.out.println($(By.xpath("(//div[@class='inventory_item_name'])[1]")).text());
//        for (String text : $$(By.xpath("//div[@class='inventory_item_name']")).texts()) {
//            System.out.println(text);
//        }
//        ElementsCollection elements = $$(By.xpath("//div[@class='inventory_item_name']"));
//        for (SelenideElement element : elements) {
//            System.out.println(element);
//        }
//        Selenide.sleep(3000);
    }

}
