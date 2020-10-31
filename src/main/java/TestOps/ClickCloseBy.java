package TestOps;
import TestUtils.SingletonForInstantiatingWebderiverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//
public class ClickCloseBy{
    public void clickedBelow(String tag, By locator){

        try {
            SingletonForInstantiatingWebderiverInstance.getInstance().manage().wait(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement belowThis=TestUtils.SingletonForInstantiatingWebderiverInstance.getInstance().findElement(locator);
            ;
    WebElement lastResort= TestUtils.SingletonForInstantiatingWebderiverInstance.getInstance()
            .findElement(RelativeLocator.withTagName(tag).below(belowThis));
        lastResort.click();
}
    public void findAbove( String tag, By locator){
        WebElement belowThis=TestUtils.SingletonForInstantiatingWebderiverInstance.getInstance().findElement(locator);
        ;
        WebElement lastResort= TestUtils.SingletonForInstantiatingWebderiverInstance.getInstance()
                .findElement(RelativeLocator.withTagName(tag).below(belowThis));

    }


}

