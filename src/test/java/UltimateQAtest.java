import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UltimateQAtest extends SetupTest {

    @Test
    public void testone() {
        driver.findElementById("idExample").click();
        WebElement buttonSuccess =  driver.findElementByClassName("entry-title");
        Assertions.assertEquals("Button success", buttonSuccess.getText());

    }

}
