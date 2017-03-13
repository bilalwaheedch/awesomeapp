package Cart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Bilal on 11-03-2017.
 */
public class UiCart {
    @FindBy(xpath = "//android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public WebElement txtCartCount;

}
