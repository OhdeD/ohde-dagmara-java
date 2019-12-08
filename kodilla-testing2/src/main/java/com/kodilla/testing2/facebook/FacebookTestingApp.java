package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String ADDRESS_FB = "https://facebook.com/";
    public static final String DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String MONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";
    public static final String WOMAN = "//div[contains(@class, \"mtm _5wa2 _5dbb\") and contains(@id, \"u_0_10\")]/span/span/input[1]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(ADDRESS_FB);

        WebElement day = driver.findElement(By.xpath(DAY));
        Select select_day = new Select(day);
        select_day.selectByIndex(31);

        WebElement month = driver.findElement(By.xpath(MONTH));
        Select select_month = new Select(month);
        select_month.selectByIndex(5);

        WebElement year = driver.findElement(By.xpath(YEAR));
        Select select_year = new Select(year);
        select_year.selectByIndex(30);

        WebElement input = driver.findElement(By.xpath(WOMAN));
        input.click();
    }
}
