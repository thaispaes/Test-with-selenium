package pages;

import org.openqa.selenium.By;

public class DressesPage extends BasePage{

    private By menuDressesLocator = By.cssSelector("#block_top_menu > ul >li:nth-child(2) > a");
    private By submenuCasualDressesLocator = By.cssSelector("#block_top menu > ul > li:nth-child(1) > a");
    private By titlePageCasualDressesLocator = By.className("cat-name");

    public void viewCasualDressesPage (){
        if(super.isDisplayed(menuDressesLocator)) {
            super.actionMoveToElementPerform(menuDressesLocator);
            super.actionMoveToElementClickPerform(submenuCasualDressesLocator);
        } else {
            System.out.println("menu dresses was not found");
        }
    }

    public String getTitlePage(){
        return super.getText(titlePageCasualDressesLocator);
    }
}
