package testvrl;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagesvrl.BusesOnContract;
import pagesvrl.OneWay;

public class TestVrl {
	WebDriver driver;
	@BeforeTest
	public void browser() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlload() {
		driver.get("https://www.vrlbus.in/#/");
	}
	@Test
	public void setup() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		OneWay ow=new OneWay(driver);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(2000);
		driver.navigate().refresh();
		ow.entersdd("AHMEDABAD", "BANGALORE", "30/08/2023");
		ow.search();
		driver.navigate().refresh();
		BusesOnContract boc=new BusesOnContract(driver);
		boc.open();
		Thread.sleep(2000);
		boc.contact_details("Anns", "ann@gmail.com", "9876543210");
	}
}
