package ru.appline.framework.steps;

import io.cucumber.java.ru.И;
import ru.appline.framework.managers.PageManager;

public class AuthPageSteps {
    private final PageManager pageManager = PageManager.getPageManager();

    @И("^Заполнить поле \"(.+)\" для авторизации значением \"(.+)\"$")
    public void fillAuthField(String nameField, String value) {
        pageManager.getAuthPage().fillAuthField(nameField, value);
    }

    @И("^Кликнуть на кнопку 'Войти'$")
    public void clickLoginButton() {
        pageManager.getAuthPage().clickLoginButton();
    }

}
