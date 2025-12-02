package com.letcode.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class ClickPage {

    private WebDriver driver;

    public ClickPage(WebDriver driver) {
        this.driver = driver;
    }

    private By positionBtn = By.id("position");
    private By colorBtn = By.id("color");
    private By sizeBtn = By.id("property");
    private By disabledBtn = By.id("isDisabled");

    public Point getButtonPosition() {
        return driver.findElement(positionBtn).getLocation();
    }

    public String getButtonColor() {
        return driver.findElement(colorBtn).getCssValue("background-color");
    }

    public String getButtonSize() {
        int h = driver.findElement(sizeBtn).getSize().getHeight();
        int w = driver.findElement(sizeBtn).getSize().getWidth();
        return "H=" + h + " W=" + w;
    }

    public boolean isButtonEnabled() {
        return driver.findElement(disabledBtn).isEnabled();
    }
}
