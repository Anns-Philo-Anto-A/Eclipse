package pagesvrl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BusesOnContract {
	WebDriver driver;
	By vrlBusesonContract=By.xpath("//*[@id=\"VRL_Header\"]/div/div/div/div/div[2]/div[2]/nav/ul/li[4]/a");
	By vrlCName=By.xpath("//*[@id=\"txtcontactPerson\"]");
	By vrlEmail=By.xpath("//*[@id=\"txtEmail\"]");
	By vrlMobile=By.xpath("//*[@id=\"txtMobileNo\"]");
	public BusesOnContract(WebDriver driver) {
		this.driver=driver;
	}
	public void open() {
		driver.findElement(vrlBusesonContract).click();
	}
	public void contact_details(String name,String email,String mobile) {
		driver.findElement(vrlCName).sendKeys(name);
		driver.findElement(vrlEmail).sendKeys(email);
		driver.findElement(vrlMobile).sendKeys(mobile);
	}
}
