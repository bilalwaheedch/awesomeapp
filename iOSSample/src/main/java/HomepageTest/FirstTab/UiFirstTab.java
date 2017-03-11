package HomepageTest.FirstTab;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Bilal on 11-03-2017.
 */
public class UiFirstTab extends Base{
    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIASwitch[1]")
    public WebElement tglOnOff;

    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[1]")
    public WebElement txtToggle;

}
