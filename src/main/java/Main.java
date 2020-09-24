import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Main {
    private static WebDriver driver;

    public static void main(String[] args) {
        SingletonForInstantiatingWebderiverInstance launch = new SingletonForInstantiatingWebderiverInstance();
        launch.openBrowser();
        FindAndClick findAndClick= new FindAndClick();
        findAndClick.clicked();
        // click register
//        FirstPage firstPage = new FirstPage();
//        firstPage.clickedRegister();
//        try {
//            String classOfWebElement = "seperator-link";
//            driver.findElement(By.className(classOfWebElement)).click();
//        } catch (Exception e) {
//            System.out.println("the id was not found");
        }
    }



