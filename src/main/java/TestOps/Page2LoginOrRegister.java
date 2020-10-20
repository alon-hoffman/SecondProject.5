package TestOps;

import org.openqa.selenium.By;

public class Page2LoginOrRegister {
    public void clickedRegister() {
        //press הרשמה
        FindAndClick findAndClick= new FindAndClick();
        findAndClick.clickElement(By.className("text-btn"));

    }
}
