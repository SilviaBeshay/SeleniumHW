package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https:/www.facebook.com");

        WebElement create= driver.findElement(By.linkText("Create new account"));
        create.click();

        Thread.sleep(2000);

        WebElement firstName= driver.findElement(By.name("firstname"));
        firstName.sendKeys("Silvia");

        Thread.sleep(2000);

        WebElement lastName= driver.findElement(By.name("lastname"));
        lastName.sendKeys("Beshay");

        Thread.sleep(2000);

        WebElement email= driver.findElement(By.name("reg_email__"));
        email.sendKeys("sbesha01@yahoo.com");

        Thread.sleep(2000);

        WebElement pass= driver.findElement(By.id("password_step_input"));
        pass.sendKeys("5522Sb@146544");

        WebElement bMonth= driver.findElement(By.id("month"));
        bMonth.sendKeys("Jul");

        Thread.sleep(1000);

        WebElement bDay= driver.findElement(By.id("day"));
        bDay.sendKeys("1st");

        Thread.sleep(1000);

        WebElement bYear= driver.findElement(By.id("year"));
        bYear.sendKeys("1985");

        Thread.sleep(1000);



        WebElement gen= driver.findElement(By.name("Female"));
        gen.sendKeys("Female");

        Thread.sleep(2000);

        WebElement sign= driver.findElement(By.linkText("Sign Up"));
        sign.click();

        driver.quit();

    }
}
