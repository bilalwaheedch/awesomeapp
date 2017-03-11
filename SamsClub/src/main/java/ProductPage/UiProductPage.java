package ProductPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Bilal on 11-03-2017.
 */
public class UiProductPage {
    String addToCart = "Ship This Item";
    @FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.Button[2]")
    public WebElement btnAddToCart;
    @FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.Button[1]")
    public WebElement btnDeclineProtectionPlan;


}
