package methods;

import Cart.UiCart;
import Homepage.UiHomepage;
import ProductPage.UiProductPage;
import SearchResults.UiSearchResults;
import common.Base;
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
        uiHomepage.tfSearchField.click();
        uiHomepage.tfSearchField.sendKeys(item, Keys.ENTER);
        UiSearchResults uiSearchResults = PageFactory.initElements(ad,UiSearchResults.class);
        uiSearchResults.lnkFirstResult.click();
        UiCart uiCart = PageFactory.initElements(ad,UiCart.class);
        int cartCount = Integer.parseInt(uiCart.txtCartCount.getText());
        UiProductPage uiProductPage = PageFactory.initElements(ad,UiProductPage.class);
        scrollAndClickByName("Ship This Item");
        uiProductPage.btnAddToCart.click();
        uiProductPage.btnDeclineProtectionPlan.click();
        Assert.assertTrue(cartCount==cartCount+1);

    }
}
