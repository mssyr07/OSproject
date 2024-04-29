package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClubsPage extends BasePage{

    @FindBy(css = ".manager-name-text")
    private WebElement nameText;

     public String getNameText(){
         return nameText.getText();
     }

}
