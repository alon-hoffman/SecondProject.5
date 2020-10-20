package TestOps;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Page3WrittenPersonalInfo {

    public void thisIsMe () {

        ClickAndWrite clickAndWrite = new ClickAndWrite();

        // <input id="ember1233" placeholder="שם פרטי" required="" type="text" class="ember-view ember-text-field">
        clickAndWrite.writeInElement(By.id("ember1233"), "קובי");
        // <input id="ember1235" placeholder="מייל" required="" type="email" data-parsley-type="email" class="ember-view ember-text-field">
        clickAndWrite.writeInElement(By.id("ember1235"), "test"+this.generateRandom()+".meant@gmail.com");
        // <input id="valPass" placeholder="סיסמה" required="" type="password" class="ember-view ember-text-field">
        clickAndWrite.writeInElement(By.id("valPass"), "AutomationProject1");
        // <input id="ember1239" placeholder="אימות סיסמה" required="" type="password" data-parsley-equalto="#valPass" data-parsley-equalto-message="הסיסמאות לא זהות, אולי זה מהתרגשות :)" class="ember-view ember-text-field">
        clickAndWrite.writeInElement(By.id("ember1239"), "AutomationProject1");


        clickTheBigButton();

    }

    private void clickTheBigButton(){
        FindAndClick findAndClick= new FindAndClick();

        final String btnClass = "ui-btn orange large";
        final String btnTxt = "הרשמה ל-BUYME";
        findAndClick.clickElement(By.partialLinkText("הרשמה"));
        // By.linkText(btnTxt)

        //findAndClick.clickElement(By.className(btnClass));

        // <button type="submit" class="ui-btn orange large">הרשמה ל-BUYME</button>
        // <button type="submit" class="ui-btn orange large">הרשמה ל-BUYME</button>
    }

    private int generateRandom () {
        Random rnd = new Random();

        return rnd.nextInt(1000);

    }
}

