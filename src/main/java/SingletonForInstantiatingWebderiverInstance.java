import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SingletonForInstantiatingWebderiverInstance {

private static SingletonForInstantiatingWebderiverInstance instance=null;
    private WebDriver driver;


    private SingletonForInstantiatingWebderiverInstance(){

    }

    public void openBrowser(){
// earae WebDriver? maybe not needed for singleton
        WebDriver  driver=new ChromeDriver();
driver.get("https://buyme.co.il/");
    }
//        driver.manage().window().maximize();
//        return driver;
//}


    public static SingletonForInstantiatingWebderiverInstance getInstance(){
        if(instance==null){
            instance = new SingletonForInstantiatingWebderiverInstance();
        }
        return instance;
    }
    }

