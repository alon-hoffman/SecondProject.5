package TestUtils;

import TestOps.Page4PickDD;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestConductor {
    private final String driverPath = "C:\\Users\\OWNER\\Desktop\\chromedriver.exe";
    private final String WebDriverName = "webdriver.chrome.driver";
    private String websiteName = "https://buyme.co.il/";
    private WebDriver driver; // will be instanciated before class operations
    //add "is this a new user" if loop

   public TestConductor (String WebSiteName){

       websiteName = WebSiteName;
   }

  // @BeforeTest
    private void setProperty(String name,String path) {
       // try {
            System.setProperty(name, path);
       // } catch (Exception e) {
       //     System.out.println(e.toString());
       // }
            System.out.println("DBG MSG: Finished Setting up Property");
    }

   // @BeforeClass
    private void DriverInstantiation (String SiteName) {

       //String websiteName = "https://buyme.co.il/";

        driver = TestUtils.SingletonForInstantiatingWebderiverInstance.getInstance();
        driver.get(SiteName);
        driver.manage().window().maximize();
    }// open a given website

    @Test(priority = 1)
    private void test01_register(){
        TestOps.FirstPage firstPage = new TestOps.FirstPage();
        firstPage.clickedRegister();
    }

    @Test(priority = 2)

    private void test02_register(){
        TestOps.Page2LoginOrRegister page2= new TestOps.Page2LoginOrRegister();
        page2.clickedRegister();
    }

    @Test(priority = 3)

    private void test03_writingInfo(){
        TestOps.Page3WrittenPersonalInfo page3= new TestOps.Page3WrittenPersonalInfo();
        page3.thisIsMe();
    }

    @Test(priority = 4)

    private void test04_register(){
        Page4PickDD page4PickDD= new Page4PickDD();
        page4PickDD.valuePressed();
        try {
            page4PickDD.valuePicked();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /// more tests

    @AfterClass

    private void finishTest(){
//        driver.quit();
    }

    public void PerformTests()
    {
        //Tests:
        //@BeforeTest
        /* main operations class - will be used in main */
        // main vars decleration:

        setProperty(this.WebDriverName, driverPath);
        //@BeforeClass
        DriverInstantiation(this.websiteName);
        //@Test(priority = 1)
        test01_register();
        //@Test(priority = 2)
        test02_register();
        //@Test(priority = 3)
        test03_writingInfo();
        //@Test(priority = 4)
        test04_register();

        finishTest();


    }
}
