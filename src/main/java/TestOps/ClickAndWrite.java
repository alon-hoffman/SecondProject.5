package TestOps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ClickAndWrite {
//    public void writeInElement(By locator,String text){
////        getWebElement(By.className("ember-view ember-text-field")).sendKeys("alon");
//        FindAndClick findAndClick= new FindAndClick();
//
//    }

    public void writeInElement(By locator, String text) {

        TestUtils.SingletonForInstantiatingWebderiverInstance.getInstance().findElement(locator).sendKeys(text);

    }

}
//    By locator,String text
//        FindAndClick findAndClick= new FindAndClick();
//        findAndClick.clickElement(locator);
//        getWebElement(locator).sendKeys(text);