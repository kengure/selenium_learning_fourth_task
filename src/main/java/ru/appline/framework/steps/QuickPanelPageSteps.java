package ru.appline.framework.steps;

import io.cucumber.java.ru.И;
import ru.appline.framework.managers.PageManager;

public class QuickPanelPageSteps {
    private final PageManager pageManager = PageManager.getPageManager();

    @И("^Проверка открытия страницы панели быстрого доступа$")
    public void checkOpenQuickPanelPage() {
        pageManager.getQuickPanelPage().checkOpenQuickPanelPage();
    }

    @И("^Выбрать пункт меню \"(.+)\" в главном меню$")
    public void selectQuickPanelMenu(String nameQuickPanelMenu) {
        pageManager.getQuickPanelPage().selectQuickPanelMenu(nameQuickPanelMenu);
    }

    @И("^Выбрать пункт подменю \"(.+)\"$")
    public void selectSubMenu(String nameSubMenu) {
        pageManager.getQuickPanelPage().selectSubMenu(nameSubMenu);
    }
}
