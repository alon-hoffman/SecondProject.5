package TestOps;

import TestUtils.SingletonForInstantiatingWebderiverInstance;
import org.openqa.selenium.By;

import java.util.Random;

public class Page5product {
    //assert url
    public void selectDD() {
        ClickAndWrite clickAndWrite= new ClickAndWrite();
        //pick buisness

        //
        int sizeOfsum = SingletonForInstantiatingWebderiverInstance.getInstance()
                .findElements(By.className("thumbnail")).size();
        SingletonForInstantiatingWebderiverInstance.getInstance()
                .findElements(By.className("thumbnail")).get(this.generateRandom(sizeOfsum)).click();
        //chose price
//        findAndClick.clickElementByString("סכום");
//        int sizeOfarea = SingletonForInstantiatingWebderiverInstance.getInstance()
//                .findElements(By.className("active-result")).size();
//        SingletonForInstantiatingWebderiverInstance.getInstance()
//                .findElements(By.className("active-result")).get(this.generateRandom(sizeOfarea)).click();
//        //press button

    }

    private int generateRandom(int max) {
        Random rnd = new Random();

        return rnd.nextInt(max);
    }
}