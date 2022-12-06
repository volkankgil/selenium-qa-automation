package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
    public static void main(String[] args) {

        System.setProperty("chromeDriver","/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/checkbox");

       /* WebElement nameelement =driver.findElement(By.id("userName"));
        nameelement.click();
        nameelement.sendKeys("Volkan");

        WebElement email=driver.findElement(new By.ByCssSelector(".mr-sm-2[id='userEmail']"));
        email.click();
        email.sendKeys("volkankgil@gmail.com");

        WebElement adress=driver.findElement(new By.ByCssSelector(".form-control[placeHolder='Current Address']"));
        adress.click();
        adress.sendKeys("300 sok.");

        WebElement permanentadress=driver.findElement(By.id("permanentAddress"));
        permanentadress.click();
        permanentadress.sendKeys("Ýzmir");

        WebElement submitbutton=driver.findElement(By.id("submit"));
        submitbutton.click();

        WebElement nameText =driver.findElement(By.xpath("//div/p[@id='name']"));
        String name=nameText.getText();
        System.out.println(name);*/

        //////////////////2.ders/////////////////////////////////

        String homeCheckBoxCssValue="label[for='tree-node-home'] span.rct-checkbox svg";
        WebElement homeCheckbox=driver.findElement(new By.ByCssSelector(homeCheckBoxCssValue));
        homeCheckbox.click();

        homeCheckbox=driver.findElement(new By.ByCssSelector(homeCheckBoxCssValue));

        String homeCheckBoxClassName= homeCheckbox.getAttribute("class");

        if(homeCheckBoxClassName.equals("rct-icon rct-icon-check")){
            System.out.println("checkbox is check");
        }else {
            System.out.println("checkbox is unchecked");
        }
    }
}
