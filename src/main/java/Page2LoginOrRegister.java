import org.openqa.selenium.By;

public class Page2LoginOrRegister {
    public void clickedRegister() {
        //press הרשמה
        FindAndClick findAndClick= new FindAndClick();
        findAndClick.clickElement(By.className("text-btn"));
        //write alon
//       ClickAndWrite clickAndWrite= new ClickAndWrite();
//       clickAndWrite.writeInElement(By.className("ember-view ember-text-field"),"Alon");
    }
}
