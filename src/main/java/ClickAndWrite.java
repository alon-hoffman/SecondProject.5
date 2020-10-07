import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ClickAndWrite {
    public void writeInElement(By locator,String text){
        FindAndClick findAndClick= new FindAndClick();
        findAndClick.clickElement(locator);
        getWebElement(locator).sendKeys(text);
    }

    private WebElement getWebElement(By locator) {
        return SingletonForInstantiatingWebderiverInstance.getInstance().findElement(locator);

    }

}
