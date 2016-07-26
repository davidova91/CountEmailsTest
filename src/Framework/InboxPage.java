package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InboxPage {

    public static void goTo() {
        Driver.Wait();
        Driver.instance.findElement(By.xpath("//span/a[@href='#inbox']")).click();
    }

    public static int getCountEmails() {
        WebElement element = Driver.instance.findElement(By.xpath("//span[@class='b-folders__folder__counters__total']"));
        return Integer.parseInt(element.getText());
    }
}
