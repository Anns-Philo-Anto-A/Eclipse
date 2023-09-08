package pagesvrl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OneWay {
	WebDriver driver;
	By vrlSource=By.xpath("//*[@id=\"FromCity\"]");
	By vrlDestination=By.xpath("//*[@id=\"ToCity\"]");
	By vrlDeparting=By.xpath("//*[@id=\"txtFromDate\"]");
	By vrlSearch=By.xpath("//*[@id=\"demo\"]/section[2]/div/div/div[1]/div/div/div/div/div[3]/button");
	public OneWay(WebDriver driver) {
		this.driver=driver;
	}
	public void entersdd(String source,String destination,String date) {
		driver.findElement(vrlSource).sendKeys(source);
		driver.findElement(vrlDestination).sendKeys(destination);
		driver.findElement(vrlDeparting).clear();
		driver.findElement(vrlDeparting).sendKeys(date);
	}
	public void search() {
		driver.findElement(vrlSearch).click();
	}
}
