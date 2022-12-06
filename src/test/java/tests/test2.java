package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {
    public static void main(String[] args) {

        System.setProperty("chromeDriver","/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/automation-practice-form");

        WebElement sportCheckbox=driver.findElement(By.id("hobbies-checkbox-1"));
        boolean isEnabled=sportCheckbox.isEnabled();
        System.out.println(isEnabled);

        WebElement sportCheckboxLabel=driver.findElement(new By.ByCssSelector("label[for='hobbies-checkbox-1']"));

        try {
            sportCheckbox.click();
        }catch (ElementClickInterceptedException e){
            sportCheckboxLabel.click(); // butonu bulamadýðý yanýndaki yazýya týkladýðý için exception fýrlattýk.
        }

        boolean isselectedSportCheckBox = sportCheckbox.isSelected();
        System.out.println(isselectedSportCheckBox);
    }
}
