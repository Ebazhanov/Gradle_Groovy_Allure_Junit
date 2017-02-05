package com.base.utils

import com.codeborne.selenide.Configuration
import io.github.bonigarcia.wdm.ChromeDriverManager

class BrowserSelection {

    static void selectBrowser(String browser) throws Exception {

        if (browser == "Firefox") {
            //TODO
        } else if (browser == "Chrome") {
            Configuration.browser = "Chrome"
            ChromeDriverManager.getInstance().setup()
        } else if (browser == "IE") {
            //TODO
        } else if (browser == "Safari") {
            //TODO
        } else {
            throw new IllegalStateException("Browser " + browser + " not supported in tests");
        }
    }

}
