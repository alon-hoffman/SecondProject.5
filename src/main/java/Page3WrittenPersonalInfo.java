import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Page3WrittenPersonalInfo {
    public void thisIsMe (){
        ClickAndWrite clickAndWrite= new ClickAndWrite();
        clickAndWrite.writeInElement(By.className("ember-view ember-text-field"),"Alon");
    }
}

