package com.base.pages

import com.codeborne.selenide.Condition
import ru.yandex.qatools.allure.annotations.Step

import static com.codeborne.selenide.Selenide.$

class LoginPage {

    @Step
    enterUserEmail(String userEmail) {
        $("#email").sendKeys(userEmail)
        return this
    }

    @Step
    enterUserPassword(String userPassword) {
        $("#password").sendKeys(userPassword)
        return this
    }

    @Step
    clickOnSubmitButton() {
        $("#submit-button").click()
        $(".avatar-me.js-avatar-me").waitUntil(Condition.visible, 3000)
        return new HomePage()
    }

}
