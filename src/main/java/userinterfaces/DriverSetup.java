package userinterfaces;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {
    public static WebDriver initializeDriver() {
        System.setProperty("webdriver.chrome.driver", "ruta/al/driver/chromedriver.exe");
        return new ChromeDriver();
    }
}