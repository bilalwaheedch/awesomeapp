package AddToCart;

import methods.CommonMethods;
import org.testng.annotations.Test;

/**
 * Created by Bilal on 11-03-2017.
 */
public class CartTest extends CommonMethods {
    @Test
    public void addToCartTest(){
        addToCart("Xbox One");
    }
}
