// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class HomeTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  public String waitForWindow(int timeout) {
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Set<String> whNow = driver.getWindowHandles();
    Set<String> whThen = (Set<String>) vars.get("window_handles");
    if (whNow.size() > whThen.size()) {
      whNow.removeAll(whThen);
    }
    return whNow.iterator().next();
  }
  @Test
  public void home() {
    driver.get("https://demoqa.com/");
    driver.manage().window().setSize(new Dimension(1382, 744));
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.cssSelector(".banner-image")).click();
    vars.put("win573", waitForWindow(2000));
    vars.put("root", driver.getWindowHandle());
    driver.switchTo().window(vars.get("win573").toString());
    driver.close();
    driver.switchTo().window(vars.get("root").toString());
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.cssSelector(".banner-image")).click();
    vars.put("win1330", waitForWindow(2000));
    driver.switchTo().window(vars.get("win1330").toString());
    driver.close();
    driver.switchTo().window(vars.get("root").toString());
    driver.findElement(By.cssSelector(".card:nth-child(1) .card-body")).click();
    driver.findElement(By.cssSelector(".card:nth-child(2) > div")).click();
    driver.findElement(By.cssSelector(".body-height")).click();
    driver.findElement(By.cssSelector(".card:nth-child(3) path")).click();
    driver.findElement(By.cssSelector(".card:nth-child(4)")).click();
    driver.findElement(By.cssSelector(".card:nth-child(5) path")).click();
    driver.findElement(By.cssSelector(".card:nth-child(6) path")).click();
    js.executeScript("window.scrollTo(0,0.007845640182495117)");
    driver.findElement(By.cssSelector("header img")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".banner-image"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
  }
}
