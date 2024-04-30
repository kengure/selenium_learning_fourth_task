package ru.appline.framework.steps;

import io.cucumber.java.ru.И;
import ru.appline.framework.managers.PageManager;

public class BusinessTripPageSteps {
    private final PageManager pageManager = PageManager.getPageManager();

    @И("^Проверка открытия страницы командировок$")
    public void checkOpenBusinessTripPage() {
        pageManager.getBusinessTripPage().checkOpenBusinessTripPage();
    }

    @И("^Проверка открытия окна создания командировки$")
    public void checkOpenCreateBusinessTripWindow() {
        pageManager.getBusinessTripPage().checkOpenCreateBusinessTripWindow();
    }

    @И("^Кликнуть на кнопку создания командировки$")
    public void clickCreateBusinessTripButton() {
        pageManager.getBusinessTripPage().clickCreateBusinessTripButton();
    }

    @И("^Выбрать подразделение \"(.+)\"$")
    public void selectBusinessUnit(String subdivisionName) {
        pageManager.getBusinessTripPage().selectBusinessUnit(subdivisionName);
    }

    @И("^Кликнуть на кнопку открытия списка$")
    public void clickOpenListButton() {
        pageManager.getBusinessTripPage().clickOpenListButton();
    }

    @И("^Выбрать организацию$")
    public void chooseOrganization() {
        pageManager.getBusinessTripPage().chooseOrganization();
    }

    @И("^Выбрать чекбокс билетов$")
    public void setCheckboxTicketsOrder() {
        pageManager.getBusinessTripPage().setCheckboxTicketsOrder();
    }

    @И("^Заполнить поле \"(.+)\" при создании командировки значением \"(.+)\"$")
    public void fillBusinessTripField(String nameField, String value) {
        pageManager.getBusinessTripPage().fillBusinessTripField(nameField, value);
    }

    @И("^Кликнуть на кнопку 'Сохранить и закрыть'$")
    public void clickSaveAndCloseButton() {
        pageManager.getBusinessTripPage().clickSaveAndCloseButton();
    }

    @И("^Проверить сообщение об ошибке \"(.+)\"$")
    public void checkErrorMessageAtValidationPopUp(String errorMessage) {
        pageManager.getBusinessTripPage().checkErrorMessageAtValidationPopUp(errorMessage);
    }
}
