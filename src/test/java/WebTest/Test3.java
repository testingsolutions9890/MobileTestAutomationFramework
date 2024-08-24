package WebTest;

import Base.BasicTest;
import POClass.SauceLabLoginPage;
import UserException.UserDefinedException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3 extends BasicTest {



    @Test
    public void loginTest() throws UserDefinedException {
        try {
            SauceLabLoginPage sauceLabLogin = new SauceLabLoginPage(driver);
            sauceLabLogin.enterUsername("standard_userrr");
            sauceLabLogin.enterPassword("secret_sauce");
            sauceLabLogin.clickLogin();
            Assert.assertEquals(sauceLabLogin.getTitle(), "Products", "Verified");
        }
        catch (Exception e){
            handleException(e);
        }
    }
}
