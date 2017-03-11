package Homepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Bilal on 11-03-2017.
 */
public class UiHomepage {
    @FindBy(xpath = "//android.widget.RelativeLayout[1]/android.widget.EditText[1]")
    public WebElement btnEnableSearch;

    @FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.EditText[1]")
    public WebElement tfSearchField;
}
