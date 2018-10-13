package uiAutomation.tests.search;

import org.testng.Assert;
import org.testng.annotations.Test;
import uiAutomation.BaseTest;
import uiAutomation.pages.google.MainPage;
import uiAutomation.pages.google.ResultPage;


public class GoogleSearchTest extends BaseTest {

    @Test
    public void test001() {
        MainPage mainPage = new MainPage(driver);
        ResultPage resultPage = new ResultPage(driver);

        String queryString = "query";

        mainPage.open();
        mainPage.typeRequestInSearchInput(queryString);
        mainPage.submitSearch();

        resultPage.printOutAmountOfResult();

        String actualPageTitle = resultPage.getPageTitle();
        String expectedPageTitle = "query - Google Search";

        Assert.assertEquals(actualPageTitle, expectedPageTitle);
    }

    @Test
    public void test002() {
        MainPage mainPage = new MainPage(driver);
        ResultPage resultPage = new ResultPage(driver);

        String queryString = "query";

        mainPage.open();
        mainPage.typeRequestInSearchInput(queryString);
        mainPage.submitSearch();

        resultPage.printOutAmountOfResult();

        String actualPageTitle = resultPage.getPageTitle();
        String expectedPageTitle = "query - Google Search";

        Assert.assertEquals(actualPageTitle, expectedPageTitle);
    }

    @Test
    public void test003() {
        System.out.println("3");
    }

    @Test
    public void test004() {
        System.out.println("4");
    }

    @Test
    public void test005() {
        System.out.println("5");
    }

    @Test
    public void test006() {
        System.out.println("6");
    }

    @Test
    public void test007() {
        System.out.println("7");
    }

    @Test
    public void test008() {
        System.out.println("8");
    }

    @Test
    public void test009() {
        System.out.println("9");
    }



}