import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InfrastructureAbstractionTest {

    //the test does not need to care about the environment,
    // it simply asks the infrastructure for it

    private WebDriver webdriver;
    InfrastructureEnv infrastructureEnv = new InfrastructureEnv();

    @BeforeEach
    public void setUp(){

        webdriver = new ChromeDriver();
       // webdriver.get("https://the-internet.herokuapp.com/login");
    }

    @Test
    public void login(){

       // String env = "https://the-internet.herokuapp.com/login";
        webdriver.get(infrastructureEnv.getAdminLoginUrl());

        webdriver.findElement(By.id("username")).sendKeys("tomsmith");
        webdriver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        webdriver.findElement(By.cssSelector("button[type*='submit']")).click();

       // Assertions.assertEquals("You logged into a secure area!\n" +
           //     "?", webdriver.findElement(By.id("flash-messages")).getText());
    }

}
