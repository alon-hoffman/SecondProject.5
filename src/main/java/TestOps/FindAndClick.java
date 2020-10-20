package TestOps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindAndClick {

    public void clickElement(By locator) {
        getWebElement(locator).click();
        //getWebElement(By.partialLinkText()).
    }

    private WebElement getWebElement(By locator) {
        return TestUtils.SingletonForInstantiatingWebderiverInstance.getInstance().findElement(locator);
    }
}

