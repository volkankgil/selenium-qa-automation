package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testlesson3 {
    public static void main(String[] args) {


        System.setProperty("chromeDriver", "/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/radio-button");

        WebElement yesradiobutton=driver.findElement(new By.ByCssSelector("label[for='yesRadio']"));
        Boolean isEnabled=yesradiobutton.isEnabled();

        if(isEnabled){
            yesradiobutton.click();
            System.out.println("Clicked Yes Radio Button");
        }

        WebElement radiobuttontext=driver.findElement(new By.ByCssSelector("p.mt-3"));
        System.out.println(radiobuttontext.getText());

        WebElement noradioButton=driver.findElement(By.id("noRadio"));
        noradioButton.isEnabled();
        System.out.println(noradioButton);
    }
}
