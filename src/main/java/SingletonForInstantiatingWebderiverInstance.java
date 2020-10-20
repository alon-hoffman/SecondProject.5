import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonForInstantiatingWebderiverInstance {





        private static ChromeDriver instance = null;

    private SingletonForInstantiatingWebderiverInstance() { }

    public static ChromeDriver getInstance() {
        if (instance == null) {
            instance = new ChromeDriver();
        }
        return instance;
    }
}

