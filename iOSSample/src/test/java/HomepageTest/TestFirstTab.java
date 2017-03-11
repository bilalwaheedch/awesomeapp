package HomepageTest;

import HomepageTest.FirstTab.UiFirstTab;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Bilal on 11-03-2017.
 */
public class TestFirstTab extends Base {

    @Test
    public void ToggleTest(){
        UiFirstTab uiFirstTab = PageFactory.initElements(ad,UiFirstTab.class);
        uiFirstTab.tglOnOff.click();
        Assert.assertEquals(uiFirstTab.txtToggle.getAttribute("name"),"OFF");
    }
}
