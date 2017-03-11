package SearchResults;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Bilal on 11-03-2017.
 */
public class UiSearchResults {
    @FindBy(xpath = "//android.support.v7.widget.RecyclerView[1]/android.widget.FrameLayout[1]")
    public WebElement lnkFirstResult;
}
