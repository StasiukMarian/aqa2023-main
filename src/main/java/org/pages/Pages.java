package org.pages;

import org.pages.burgermenupage.BurgerMenuPage;
import org.pages.dropdownfiltermenupage.DropDownFilterMenuPage;
import org.pages.footernavigationpage.FooterNavigationPage;
import org.pages.item.ItemDetails;
import org.pages.loginpage.LoginPage;
import org.pages.mainpage.MainPage;
import org.pages.shoppingcardpage.ShoppingCardPage;

public class Pages {
    private static LoginPage loginPage;
    private static MainPage mainPage;
    private static BurgerMenuPage burgerMenuPage;
    private static DropDownFilterMenuPage dropDownFilterMenuPage;
    private static FooterNavigationPage footerNavigationPage;
    private static ShoppingCardPage shoppingCardPage;
    private static ItemDetails itemDetails;

    public static LoginPage loginPage(){
        if (loginPage == null){
            loginPage = new LoginPage();
        }
        return loginPage;
    }
    public static MainPage mainPage(){
        if (mainPage == null){
            mainPage = new MainPage();
        }
        return mainPage;
    }
    public static BurgerMenuPage burgerMenuPage(){
        if (burgerMenuPage == null){
            burgerMenuPage = new BurgerMenuPage();
        }
        return burgerMenuPage;
    }
    public static DropDownFilterMenuPage dropDownFilterMenuPage(){
        if (dropDownFilterMenuPage == null){
            dropDownFilterMenuPage = new DropDownFilterMenuPage();
        }
        return dropDownFilterMenuPage;
    }

    public static FooterNavigationPage footerNavigationPage() {
        if (footerNavigationPage == null) {
            footerNavigationPage = new FooterNavigationPage();
        }
        return footerNavigationPage;
    }
    public static ShoppingCardPage shoppingCardPage() {
        if (shoppingCardPage == null) {
            shoppingCardPage = new ShoppingCardPage();
        }
        return shoppingCardPage;
    }
    public static ItemDetails itemDetails() {
        if (itemDetails == null) {
            itemDetails = new ItemDetails();
        }
        return itemDetails;
    }
}
