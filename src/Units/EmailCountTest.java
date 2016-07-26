package Units;

import Framework.Driver;
import Framework.InboxPage;
import Framework.LoginPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmailCountTest {

    @Before
    public void Start() {
        Driver.Init();
    }

    @Test
    public void EmailCount() {

        String login = "test_1212";
        String pass = "testPassword_1212";
        int expectedResult = 2;

        LoginPage.goTo();
        LoginPage.login(login, pass);

        InboxPage.goTo();

        Assert.assertEquals(expectedResult, InboxPage.getCountEmails());
    }

    @After
    public void Clean() {
        Driver.Close();
    }
}
