package com.web.automation.test;

import org.testng.annotations.*;

public class TestApp {

    @BeforeSuite(groups = {"group1"})
    public void selectBrowser() {
        System.out.println("Select Chrome");
    }

    @BeforeTest(groups = {"group1"})
    public void openBrowser() {
        System.out.println("Open the Browser");
    }

    @BeforeTest(groups = {"group1"})
    public void goURL() {
        System.out.println("go 'www.facebook.com'");
    }

    @BeforeTest(groups = {"group1"})
    public void facebookLogin() {
        System.out.println("logging facebook");
    }

    @BeforeTest(groups = {"group1"})
    public void goProfile() {
        System.out.println("go to my facebook profile");
    }

    @BeforeTest(groups = {"group2"})
    public void goMyFriends() {
        System.out.println("go to my friends");
    }

    @BeforeTest(groups = {"group2"})
    public void selectFriend() {
        System.out.println("select friend in facebook");
    }

    @Test(groups = {"group2"})
    public void deleteFriend() {
        System.out.println("Delete friend");
    }

    @BeforeTest(groups = {"group3"})
    public void editProfile() {
        System.out.println("go to edit profile");
    }

    @Test(groups = {"group3"})
    public void changePFP() {
        System.out.println("change my profile picture");
    }

    @AfterTest(groups = {"group1"})
    public void logoutFacebook() {
        System.out.println("logout facebook");
    }

    @AfterTest(groups = {"group1"})
    public void closeBrowser() {
        System.out.println("close browser");
    }


}
