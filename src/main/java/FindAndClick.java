import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FindAndClick {
    String classOfWebElement=null;
    // Getter
    public String getName() {
        return classOfWebElement;
    }

    // Setter
    public void setName(String newName) {
        this.classOfWebElement = newName;
    }
    @Test
    // add find by id
        public void clicked() {
        //XXX
        classOfWebElement = "seperator-link";
//        XXX
        WebDriver  driver=new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\chromedriver.exe");
        try {
            driver.findElement(By.className(classOfWebElement)).click();
        } catch (Exception e) {
            System.out.println("the id " + classOfWebElement + " was not found");
        }
    }
}

