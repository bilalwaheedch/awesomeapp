package methods;

import Cart.UiCart;
import Homepage.UiHomepage;
import ProductPage.UiProductPage;
import SearchResults.UiSearchResults;
import common.Base;
import io.appium.java_client.MobileBy;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Bilal on 11-03-2017.
 */
public class CommonMethods extends Base {
    public void addToCart(String item){
        UiHomepage uiHomepage = PageFactory.initElements(ad,UiHomepage.class);
        uiHomepage.btnEnableSearch.click();
//        uiHomepage.tfSearchField.click();
        uiHomepage.tfSearchField.sendKeys(item);
        ad.sendKeyEvent(66);
//        ad.findElement(MobileBy.id("com.rfi.sams.android:id/searchTextView")).sendKeys(item, Keys.ENTER);
        UiSearchResults uiSearchResults = PageFactory.initElements(ad,UiSearchResults.class);
        uiSearchResults.btnFirstAddToCart.click();
        uiSearchResults.btnFirstAddToCartConfirm.click();
        uiSearchResults.btnDeclineServicePlan.click();
    }
    public int getCartCount(){
        UiCart uiCart = PageFactory.initElements(ad,UiCart.class);
        return Integer.parseInt(uiCart.txtCartCount.getText());
    }
}
