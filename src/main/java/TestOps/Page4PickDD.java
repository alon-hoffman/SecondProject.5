package TestOps;

import TestUtils.SingletonForInstantiatingWebderiverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Page4PickDD {
    //<a class="chosen-single" tabindex="-1"><span>סכום</span><div><b></b></div></a>
    public void selectDD() {
        FindAndClick findAndClick = new FindAndClick();
        //price
        findAndClick.clickElementByString("סכום");
        int sizeOfsum = SingletonForInstantiatingWebderiverInstance.getInstance()
                .findElements(By.className("active-result")).size();
        SingletonForInstantiatingWebderiverInstance.getInstance()
                .findElements(By.className("active-result")).get(this.generateRandom(sizeOfsum)).click();
        //location
        findAndClick.clickElementByString("אזור");
        int sizeOfarea = SingletonForInstantiatingWebderiverInstance.getInstance()
                .findElements(By.className("active-result")).size();
        SingletonForInstantiatingWebderiverInstance.getInstance()
                .findElements(By.className("active-result")).get(this.generateRandom(sizeOfarea)).click();
        //catagory
        findAndClick.clickElementByString("קטגוריה");
        int sizeOfcatagory = SingletonForInstantiatingWebderiverInstance.getInstance()
                .findElements(By.className("active-result")).size();
        SingletonForInstantiatingWebderiverInstance.getInstance()
                .findElements(By.className("active-result")).get(this.generateRandom(sizeOfcatagory)).click();
        //תמצא לי מתנה
        findAndClick.clickElement(By.id("ember838"));
    }

    private int generateRandom(int max) {
        Random rnd = new Random();

        return rnd.nextInt(max);

    }
}
