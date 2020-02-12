package TestClasses;



import PageObjects.GloPageLogin;
import Utility.BaseClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class GloOpen extends BaseClass {

    @Test
    public void GloLoginPage() throws IOException {
        driver = initializer();

        driver.get(prop.getProperty("url"));

        GloPageLogin glp = PageFactory.initElements(driver,GloPageLogin.class);
        glp.Glo_Login("anubhav.dalela","Fwreck1235$");
        System.out.println("home page");



    }
}
