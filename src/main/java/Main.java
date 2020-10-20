import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Main {
    private static WebDriver driver;
    //add "is this a new user" if loop
@BeforeTest
public static void setProperty() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\chromedriver.exe");
}
    @BeforeClass
    public static void prepareTest() {
        driver = SingletonForInstantiatingWebderiverInstance.getInstance();
        driver.get("https://buyme.co.il/");
        driver.manage().window().maximize();
    }


    @Test(priority = 1)
    public void test01_register(){
        FirstPage firstPage = new FirstPage();
        firstPage.clickedRegister();
    }
    @Test(priority = 2)
    public void test02_register2(){
    Page2LoginOrRegister page2= new Page2LoginOrRegister();
    page2.clickedRegister();
    }
    //XXX
//    @Test(priority = 3)
//
////    public void test03_writingInfo(){
//    ClickAndWrite clickAndWrite= new ClickAndWrite();
//    clickAndWrite.writeInElement();
//    }

    @Test(priority = 3)

    public void test03_writingInfo(){
    Page3WrittenPersonalInfo page3= new Page3WrittenPersonalInfo();
    page3.thisIsMe();
    }
    @Test(priority = 4)
    public void pressTheButton(){
        Page3WrittenPersonalInfo page3= new Page3WrittenPersonalInfo();
        page3.clickTheBigButton();
    }


    /// more tests

    @AfterClass
    public static void finishTest(){
            driver.quit();
    }
}



