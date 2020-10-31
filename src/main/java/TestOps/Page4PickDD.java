package TestOps;

import TestUtils.SingletonForInstantiatingWebderiverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Page4PickDD {
    //<a class="chosen-single" tabindex="-1"><span>סכום</span><div><b></b></div></a>
    public void valuePressed() {
        FindAndClick findAndClick = new FindAndClick();
        findAndClick.clickElementByString("סכום");
        findAndClick.clickElementByString("מתנות עד לבית");

        ///html/body/div[2]/div/header/div[3]/div/form/div[1]/a/span
//        <a class="chosen-single" tabindex="-1"><span>סכום</span><div><b></b></div></a>
        //main-container home-page-offset
        String className = "main-container home-page-offset ";
        String path = "/html/body/div[2]/div/header/div[3]/div/form/div[1]/a/span";
        //class chosen-drop
    }
    public void valuePicked() throws InterruptedException {
        SelectFromDropDown selectFromDropDown = new SelectFromDropDown();
        SingletonForInstantiatingWebderiverInstance.getInstance().manage().wait(4000);
        //
        String xpath= "/html/body/div[1]/div/header/div[3]/div/form/div[1]/a";

//<div class="chosen-container chosen-container-single form-control dib search-chosen ember-view ember-chosenselect form-control chosen-rtl chosen-rtl chosen-container-single-nosearch chosen-container-active" style="width: 100%;" title="" id="ember778_chosen"><a class="chosen-single" tabindex="-1"><span>200-299 ש"ח</span><div><b></b></div></a><div class="chosen-drop"><div class="chosen-search"><input type="text" autocomplete="off" readonly=""></div><ul class="chosen-results"><li class="active-result" data-option-array-index="0" style="">סכום</li><li class="active-result" data-option-array-index="1" style="">עד 99 ש"ח</li><li class="active-result" data-option-array-index="2" style="">100-199 ש"ח</li><li class="active-result result-selected" data-option-array-index="3" style="">200-299 ש"ח</li><li class="active-result" data-option-array-index="4" style="">300-499 ש"ח</li><li class="active-result" data-option-array-index="5" style="">500-750 ש"ח</li><li class="active-result" data-option-array-index="6" style="">מעל 750 ש"ח</li></ul></div></div>
String optionA= "chosen-drop";
String optionB= "chosen-search";
String optionC= "Chosen-result";
String optionD= "active-result";
String optionE= "active-result result-selected";
    selectFromDropDown.selected(By.name("סכום"));

//        selectFromDropDown.selected(By.id("ember778_chosen"));
//        ClickCloseBy clickCloseBy= new ClickCloseBy();
//        String tag= "סכום";
////        WebElement firstDD= clickCloseBy.findAember778_chosen
    }

}
