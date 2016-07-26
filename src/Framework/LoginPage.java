package Framework;

import org.openqa.selenium.By;

public class LoginPage {

   public static void goTo() {
       Driver.instance.navigate().to("http://tut.by");
       Driver.instance.findElement(By.linkText("Почта")).click();
   }

    public static void login(String login, String pass) {
        Driver.instance.findElement(By.id("Username")).sendKeys(login);
        Driver.instance.findElement(By.id("Password")).sendKeys(pass);
        Driver.instance.findElement(By.xpath("//input[@class='button loginButton gradientforbutton']")).click();
    }
}
