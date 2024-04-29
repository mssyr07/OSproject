package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class A extends BasePage{

    @FindBy(css = ".col-lg-2.col-md-3.col-xs-6:nth-child(0)")
    private WebElement firstCar;

    public void clickOnFirstCar(){
        firstCar.click();
    }
}




