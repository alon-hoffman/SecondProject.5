import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindAndClick {

    public void clickElement(By locator) {
        getWebElement(locator).click();
    }

    private WebElement getWebElement(By locator) {
        return SingletonForInstantiatingWebderiverInstance.getInstance().findElement(locator);
    }
}

