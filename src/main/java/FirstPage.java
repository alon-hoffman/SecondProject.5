import org.testng.annotations.Test;

public class FirstPage {
    @Test
    public void clickedRegister() {
        String classOfWebElement = "seperator-link";
        FindAndClick findAndClick = new FindAndClick();
        findAndClick.clicked();
    }

}
