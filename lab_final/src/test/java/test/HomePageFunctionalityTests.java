package test;

import model.*;
import org.testng.annotations.*;
import page.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class HomePageFunctionalityTests extends CommonConditions {
    @Test
    public void oneCanSendFormWithWrongName() throws InterruptedException {
        CallBackForm callBackForm = new CallBackForm("woe", "375332562556");

        String sendWrongForm = new HomePage(driver)
                .openPage()
                .submitCallBackForm(callBackForm);

        assertThat(sendWrongForm, is(equalTo("https://www.comicskrama.by/")));
    }

    @Test
    public void oneCanSendFormWithWrongPhoneNumber() throws InterruptedException {
        CallBackForm callBackForm = new CallBackForm("Vladislav", "1111111111111");

        String sendWrongForm = new HomePage(driver)
                .openPage()
                .submitCallBackForm(callBackForm);

        assertThat(sendWrongForm, is(equalTo("https://www.comicskrama.by/")));
    }

    @Test
    public void oneCanSendEmptyForm() throws InterruptedException {
        CallBackForm emptyForm = new CallBackForm("", "");

        String sendEmptyForm = new HomePage(driver)
                .openPage()
                .submitCallBackForm(emptyForm);

        assertThat(sendEmptyForm, is(equalTo("https://www.comicskrama.by/")));
    }

    @Test
    public void oneCanSendCorrectCallBackForm() throws InterruptedException {
        CallBackForm callBackForm = new CallBackForm("Natasha", "375334567895");

        String sendCorrectForm = new HomePage(driver)
                .openPage()
                .submitCallBackForm(callBackForm);

        assertThat(sendCorrectForm, is(equalTo("https://www.comicskrama.by/")));
    }

    @Test
    public void oneCanDoSearchInRussian() {
        SearchModel russianSearch = new SearchModel("бэтмен");

        String sendSearch = new HomePage(driver)
                .openPage()
                .doSearch(russianSearch);

        assertThat(sendSearch, is(equalTo("https://www.comicskrama.by/search?q=%D0%B1%D1%8D%D1%82%D0%BC%D0%B5%D0%BD")));
    }

    @Test
    public void oneCanDoSearchInEnglish() {
        SearchModel englishSearch = new SearchModel("batman");

        String sendSearch = new HomePage(driver)
                .openPage()
                .doSearch(englishSearch);

        assertThat(sendSearch, is(equalTo("https://www.comicskrama.by/search?q=batman")));
    }

    @Test
    public void oneCanDoEmptySearch() {
        SearchModel searchModel = new SearchModel("");

        String sendSearch = new HomePage(driver)
                .openPage()
                .doSearch(searchModel);

        assertThat(sendSearch, is(equalTo("https://www.comicskrama.by/search?q=")));
    }
}
