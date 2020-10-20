package TestOps;

import org.openqa.selenium.By;

public class FirstPage {
    public void clickedRegister() {
        FindAndClick findAndClick = new FindAndClick();
        findAndClick.clickElement(By.className("seperator-link"));
    }
}
