package com.letcode.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditPage {

    private WebDriver driver;

    public EditPage(WebDriver driver) {
        this.driver = driver;
    }

    private By fullName = By.id("fullName");
    private By join = By.id("join");
    private By clearMe = By.id("clearMe");
    private By noEdit = By.id("noEdit");
    private By readOnly = By.id("dontwrite");

    public void enterFullName(String text) {
        driver.findElement(fullName).sendKeys(text);
    }

    public void appendCountry(String text) {
        driver.findElement(join).sendKeys(text);
    }

    public void clearText() {
        driver.findElement(clearMe).clear();
    }

    public boolean isFieldDisabled() {
        return !driver.findElement(noEdit).isEnabled();
    }

    public boolean isFieldReadOnly() {
        return driver.findElement(readOnly).getAttribute("readonly") != null;
    }
}
