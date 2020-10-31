package TestOps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindAndClick {

    public void clickElement(By locator) {
        getWebElement(locator).click();
        //getWebElement(By.partialLinkText()).
    }
    public void clickElementByString (String SearchTxt){
        String partialText = SearchTxt;//"BUYME";
        WebElement findWithText= TestUtils.SingletonForInstantiatingWebderiverInstance.getInstance().findElement(By.partialLinkText(partialText));

        findWithText.click();
        }





    private WebElement getWebElement(By locator) {
        return TestUtils.SingletonForInstantiatingWebderiverInstance.getInstance().findElement(locator);
    }
//    WebElement getWebElementString(String label) {
//        WebElement finWithText= TestUtils.SingletonForInstantiatingWebderiverInstance.getInstance().findElement(By.xpath("//button[contains(.,'" + label + "')]"));
//    }


    }


