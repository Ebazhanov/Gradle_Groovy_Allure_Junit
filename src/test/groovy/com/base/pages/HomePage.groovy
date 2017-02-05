package com.base.pages

import com.base.utils.PropertiesReader
import com.codeborne.selenide.Condition
import ru.yandex.qatools.allure.annotations.Step

import static com.codeborne.selenide.Selenide.$
import static com.codeborne.selenide.Selenide.open

class HomePage {

    @Step
    openHomePage() {
        open(PropertiesReader.getConfigKey("SITE_URL"))
        return this
    }

    @Step
    static clickOnLoginLink() {
        $(".topbar-menu-links a:nth-child(2)").click()
        return new LoginPage()
    }

    @Step
    avatarShouldBeVisible() {
        $(".avatar-me.js-avatar-me").shouldBe(Condition.visible)
        return this
    }

    @Step
    clickOnTopBarIcon() {
        $(".topbar-icon.icon-site-switcher.yes-hover.js-site-switcher-button.js-gps-track").click()
        return this
    }

    @Step
    static clickOnLogOutLink() {
        $(".related-links .js-gps-track:nth-child(2)").click()
        return new LogOutPage()
    }

    @Step
    linkLoginShouldBeVisible() {
        $(".topbar-menu-links a:nth-child(2)").shouldBe(Condition.visible)
        return this
    }

}
