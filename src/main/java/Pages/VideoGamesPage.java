package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class VideoGamesPage {
    private WebDriver driver;

    public VideoGamesPage (WebDriver driver){
        this.driver = driver;
    }

    //Locators
    private By videoGamesBanner = By.xpath("//b[contains(.,'Video Games')]");

    private By categoriesDiv = By.id("s-refinements");
    private By freeShippingSpan = By.xpath("//span[contains(.,'Free Shipping')]");
    private By freeShippingLink = By.tagName("a");
    //Methods
    public String getVideoGamesBanner(){
        String videoGamesBanner = driver.findElement(this.videoGamesBanner).getText();
        System.out.println("videoGames Page Banner ->"+videoGamesBanner);
        return videoGamesBanner;
    }

    public VideoGamesFreeShippingFiltered clickFreeShippingFilter(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(categoriesDiv));

        WebElement categoriesDiv = driver.findElement(this.categoriesDiv);
        WebElement freeShippingSpan = categoriesDiv.findElement(this.freeShippingSpan);

        freeShippingSpan.findElement(freeShippingLink).click();

        return new VideoGamesFreeShippingFiltered(driver);
    }

}
