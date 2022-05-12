package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String ACCEPT_COOKIES = "//button[contains(string(), 'Zezwól na korzystanie z ')]";
    public static final String CREATE_NEW_ACCOUNT = "//a[contains(string(), 'Utwórz nowe konto')]";
    public static final String NAME_FIELD = "//input[contains(@name, 'firstname')]";
    public static final String SURNAME_FIELD = "//input[contains(@name, 'lastname')]";
    public static final String WAIT_FOR = "//div[contains(@class, \"mbs _52lq fsl fwb fcb\")]";
    public static final String EMAIL_FIELD = "//input[contains(@name, 'reg_email__')]";
    public static final String REPEAT_EMAIL_FIELD = "//input[contains(@name, 'reg_email_confirmation__')]";
    public static final String PASSWORD_FIELD = "//input[contains(@name, 'reg_passwd__')]";
    public static final String DAY = "//select[contains(@name, 'birthday_day')]";
    public static final String MONTH = "//select[contains(@name, 'birthday_month')]";
    public static final String YEAR = "//select[contains(@name, 'birthday_year')]";
    public static final String SEX = "//label[contains(string(), 'Mężczyzna')]";


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        while (!driver.findElement(By.xpath(ACCEPT_COOKIES)).isDisplayed());
        driver.findElement(By.xpath(ACCEPT_COOKIES)).click();

        driver.findElement(By.xpath(CREATE_NEW_ACCOUNT)).click();

        Thread.sleep(3000);

        WebElement nameField = driver.findElement(By.xpath(NAME_FIELD));
        nameField.sendKeys("Mateusz");

        WebElement lastnameField = driver.findElement(By.xpath(SURNAME_FIELD));
        lastnameField.sendKeys("Markowski");

        WebElement emailField = driver.findElement(By.xpath(EMAIL_FIELD));
        emailField.sendKeys("email@gmail.com");
        WebElement emailConfField = driver.findElement(By.xpath(REPEAT_EMAIL_FIELD));
        emailConfField.sendKeys("email@gmail.com");

        WebElement passwordField = driver.findElement(By.xpath(PASSWORD_FIELD));
        passwordField.sendKeys("password");

        WebElement dayField = driver.findElement(By.xpath(DAY));
        Select selectDay = new Select(dayField);
        selectDay.selectByValue("19");

        WebElement monthField = driver.findElement(By.xpath(MONTH));
        Select selectMonth = new Select(monthField);
        selectMonth.selectByValue("7");

        WebElement yearField = driver.findElement(By.xpath(YEAR));
        Select selectYear = new Select(yearField);
        selectYear.selectByValue("1995");

        WebElement sexField = driver.findElement(By.xpath(SEX));
        sexField.click();



    }
}
