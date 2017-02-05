package com.base.pages

import ru.yandex.qatools.allure.annotations.Step

import static com.codeborne.selenide.Selenide.$

class LogOutPage {

    @Step
    static clickOnLogOutButton() {
        $("#controls input").click()
        return new HomePage()
    }

}
