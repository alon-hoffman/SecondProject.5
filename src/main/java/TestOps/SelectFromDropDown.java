package TestOps;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
public class SelectFromDropDown {
    public void selected(By locator, String text) {
        FindAndClick findAndClick= new FindAndClick();
        Select drpCountry = new Select(TestUtils.SingletonForInstantiatingWebderiverInstance.getInstance().findElement(locator));
        drpCountry.selectByVisibleText(text);


    }
}