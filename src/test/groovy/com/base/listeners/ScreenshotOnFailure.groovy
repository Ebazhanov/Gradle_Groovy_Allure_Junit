package com.base.listeners

import com.codeborne.selenide.Screenshots
import com.google.common.io.Files
import org.testng.ITestResult
import org.testng.TestListenerAdapter
import ru.yandex.qatools.allure.annotations.Attachment

class ScreenshotOnFailure extends TestListenerAdapter {

    @Override
    void onTestFailure(ITestResult iTestResult) {
        attachBrowserScreenshot()
    }

    @Attachment(value = "{0}", type = "image/png")
    byte[] attachBrowserScreenshot() throws IOException {
        File screenshot = Screenshots.takeScreenShotAsFile()
        return Files.toByteArray(screenshot)
    }

}
