package WebTest;

import Base.BasicTest;
import POClass.SauceLabLoginPage;
import UserException.UserDefinedException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 extends BasicTest{


    @Test

    public void webTest() throws UserDefinedException {
        try {
            SauceLabLoginPage sauceLabLogin = new SauceLabLoginPage(driver);
            sauceLabLogin.enterUsername("locked_out_user");
            sauceLabLogin.enterPassword("secret_sauce");
            sauceLabLogin.clickLogin();
            Assert.assertEquals(sauceLabLogin.getErrormessage(), "Epic sadface: Sorry, this user has been locked out.", "Verified");
        }
        catch (Exception e){
            handleException(e);
        }
    }
}
