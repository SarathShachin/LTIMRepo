package com.letcode.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {

    private WebDriver driver;

    public DropDownPage(WebDriver driver) {
        this.driver = driver;
    }

    private By fruits = By.id("fruits");
    private By heroes = By.id("superheros");
    private By lang = By.id("lang");
    private By country = By.id("country");

    public void selectFruit(String fruit) {
        new Select(driver.findElement(fruits)).selectByVisibleText(fruit);
    }

    public void selectHero(String hero) {
        new Select(driver.findElement(heroes)).selectByVisibleText(hero);
    }

    public void selectLanguage(String language) {
        new Select(driver.findElement(lang)).selectByVisibleText(language);
    }

    public void selectCountry(String c) {
        new Select(driver.findElement(country)).selectByVisibleText(c);
    }
}
