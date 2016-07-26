package Framework;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    public static WebDriver instance;

    public static void Init() {
        instance = new FirefoxDriver();
        instance.manage().window().maximize();
    }

    public static void Close() {
        instance.close();
    }

    public static void Wait() {
        Driver.instance.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }
}
