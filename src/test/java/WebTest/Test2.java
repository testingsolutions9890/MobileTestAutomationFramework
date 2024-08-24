package WebTest;

import Base.BasicTest;
import POClass.SauceLabLoginPage;
import UserException.UserDefinedException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test2 extends BasicTest {
    SauceLabLoginPage sauceLabLogin = new SauceLabLoginPage(driver);

    @DataProvider(name ="getAllDataFromExcelSheet")
    public Object[][] getAllDataFromExcelSheet(){
        Object[][] arrObj= getExcelData("Test2","Sheet1");
        return  arrObj;
    }

    @Test(dataProvider = "getAllDataFromExcelSheet")
    public void loginTest(String username, String password) throws UserDefinedException {
        try {
            sauceLabLogin.enterUsername(username);
            sauceLabLogin.enterPassword(password);
            sauceLabLogin.clickLogin();
            Assert.assertEquals(sauceLabLogin.title(), "Products", "Verified");
        }
        catch (Exception e){
            handleException(e);
        }

    }

}
