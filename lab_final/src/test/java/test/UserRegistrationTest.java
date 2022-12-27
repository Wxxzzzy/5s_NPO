package test;

import model.*;
import org.testng.annotations.*;
import page.*;
import service.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class UserRegistrationTest extends CommonConditions{
    @Test
    public void oneCanSignUpWithBadCredentials(){
        User testUser = UserCreator.withCredentialsFromProperty();

        String signedUpInUserName = new LoginPage(driver)
                .openPage()
                .singUp(testUser);
        assertThat(signedUpInUserName, is(equalTo("https://www.comicskrama.by/client_account/orders")));
    }
}
