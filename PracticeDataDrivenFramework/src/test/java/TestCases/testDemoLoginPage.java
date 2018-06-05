package TestCases;

import DataProvider.DataGenerator;
import DriverInvocation.DriverInstance;
import Pages.DemoLoginPage;
import Utility.PropertiesUtility;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class testDemoLoginPage extends DriverInstance{


    @Test(dataProvider = "Excel",dataProviderClass = DataGenerator.class)
    public void tc_001_loginFunctionality(String username,String password) throws IOException {
        openUrl(PropertiesUtility.fetchProperity("loginApplicationUrl").toString());
        DemoLoginPage page = PageFactory.initElements(driver,DemoLoginPage.class);
        page.doLogin(username,password);

    }

}
