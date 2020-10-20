import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Page3WrittenPersonalInfo {
    public void thisIsMe () {

        ClickAndWrite clickAndWrite = new ClickAndWrite();
        clickAndWrite.writeInElement(By.id("ember1219"), "קובי");
        clickAndWrite.writeInElement(By.id("ember1221"), "noharm.meant@gmail.com");
        clickAndWrite.writeInElement(By.id("valPass"), "AutomationProject1");
        clickAndWrite.writeInElement(By.id("ember1225"), "AutomationProject1");
    }
    public void clickTheBigButton(){
FindAndClick findAndClick= new FindAndClick();
findAndClick.clickElement(By.className("ui-btn orange large"));
//add assert XXX
    }
}

