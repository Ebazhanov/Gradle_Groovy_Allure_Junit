package com.tests

import com.base.SelenideBaseTest
import com.base.pages.HomePage
import com.base.utils.PropertiesReader
import org.junit.Test

class LogIn extends SelenideBaseTest {

    private static final String USER_EMAIL = PropertiesReader.config.USER_EMAIL
    private static final String USER_PASSWORD = PropertiesReader.config.USER_PASSWORD

    @Test
    void logIn() {
        new HomePage()
                .openHomePage()
                .clickOnLoginLink()
                .enterUserEmail(USER_EMAIL)
                .enterUserPassword(USER_PASSWORD)
                .clickOnSubmitButton()
                .avatarShouldBeVisible()
    }

}
