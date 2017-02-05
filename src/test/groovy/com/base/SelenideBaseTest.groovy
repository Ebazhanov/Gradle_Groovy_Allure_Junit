package com.base

import com.base.listeners.ScreenshotOnFailure
import com.base.utils.PropertiesReader
import org.junit.After
import org.junit.Before
import org.testng.annotations.Listeners

import static com.base.utils.BrowserSelection.selectBrowser
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache

@Listeners(ScreenshotOnFailure)
class SelenideBaseTest {

    @Before
    void setUp() {
        selectBrowser(PropertiesReader.getConfigKey("CHROME"))
    }

    @After
    void after() {
        clearBrowserCache()
    }

}
