package test;

import model.*;
import org.testng.annotations.*;
import page.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class UserRegistrationTest extends CommonConditions{
    @Test
    public void oneCanSignUpWithBadCredentials() throws InterruptedException {
        //User testUser = UserCreator.withCredentialsFromProperty();

        User testUser = new User("ALKS Jslk Klas", "skjdfnj123ksjdfAS","lasdg@gmail.com","111111111111");
        String signedUpInUserName = new LoginPage(driver)
                .openPage()
                .singUp(testUser);
        assertThat(signedUpInUserName, is(equalTo("https://www.comicskrama.by/client_account/orders")));
    }

    @Test
    public void oneCanSignWithRightCredentials() throws InterruptedException {
        User niceUser = new User("Ivanov Ivan Ivanovich", "strongPass123$lksd",
                "existEmail@gmail.com", "375333332525");

        String signedUpInUserName = new LoginPage(driver)
                .openPage()
                .singUp(niceUser);
        assertThat(signedUpInUserName, is(equalTo("https://www.comicskrama.by/client_account/orders")));
    }

    @Test
    public void oneCanSignWithIncorrectPhoneNumber() throws InterruptedException {
        User testUser = new User("Vasilyev Valisiy Vasilyevich", "weakPassLENfdlk324",
                "nonExistEmail@gmail.com", "234");

        String signedUpInUserName = new LoginPage(driver)
                .openPage()
                .singUp(testUser);
        assertThat(signedUpInUserName, is(equalTo("https://www.comicskrama.by/client_account/orders")));
    }

    @Test
    public void oneCanSignWithWeakPassword() throws InterruptedException {
        User weakUser = new User("Weak Weak Weak", "23431",
                "sflgkm@gmail.com", "222222222222");

        String signedUpInUserName = new LoginPage(driver)
                .openPage()
                .singUp(weakUser);

        assertThat(signedUpInUserName, is(equalTo("https://www.comicskrama.by/client_account/orders")));
    }

    @Test
    public void oneCanSignWithNonExistingEmail() throws InterruptedException {
        User user = new User("Email Email Email", "ldkr34lkjsdfgGLKj",
                "srsfgssedlrsE@gmail.com", "3333333333333");

        String signedUpInUserName = new LoginPage(driver)
                .openPage()
                .singUp(user);

        assertThat(signedUpInUserName, is(equalTo("https://www.comicskrama.by/client_account/orders")));
    }
}
