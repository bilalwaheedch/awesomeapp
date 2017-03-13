package AddToCart;

import methods.CommonMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Bilal on 11-03-2017.
 */
public class CartTest extends CommonMethods {
    @Test
    public void addToCartTest(){
        int cartCount = 0;
        addToCart("Xbox One");
        cartCount++;
        Assert.assertEquals(getCartCount(),cartCount);
    }
}
