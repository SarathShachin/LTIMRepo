package com.letcode.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By editCard = By.xpath("//a[normalize-space()='Edit']");
    private By clickCard = By.xpath("//a[normalize-space()='Click']");
    private By dropdownCard = By.xpath("//a[normalize-space()='Drop-Down']");

    public void openEditPage() {
        driver.findElement(editCard).click();
    }

    public void openClickPage() {
        driver.findElement(clickCard).click();
    }

    public void openDropdownPage() {
        driver.findElement(dropdownCard).click();
    }
}
