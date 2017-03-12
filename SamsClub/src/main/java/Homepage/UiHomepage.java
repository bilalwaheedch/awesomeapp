package Homepage;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Bilal on 11-03-2017.
 */
public class UiHomepage {
    @FindBy(xpath = "//android.widget.RelativeLayout[1]/android.widget.EditText[1]")
    public WebElement btnEnableSearch;

    @FindBy(id = "com.rfi.sams.android:id/searchTextView")
    public WebElement tfSearchField;
}
