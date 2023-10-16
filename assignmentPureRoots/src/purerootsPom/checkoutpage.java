package purerootsPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkoutpage {
	public WebDriver driver;
	public checkoutpage(WebDriver driver) {
		this.driver=driver;
	}
	By checkout=By.xpath("//body/section/div[@class='container-fluid']/div[@class='col-md-10 mx-auto']/div[@class='checkout_outer']/div[@id='checkoutDiv']/div[@class='col-md-8 item aos-init aos-animate']/form[@id='completeOrder']/div[1]/div[2]//input");
	By order=By.id("order_pickup_date");
	By picudate=By.xpath("//td[@class='day disabled'][normalize-space()='16']");
	By time=By.id("order_pickup_time");
	By hour=By.xpath("//span[@title='Pick Hour']");
	By submit=By.xpath("//i[@class='fa fa-clock']");
	By color=By.id("order_car_color");
	By model=By.id("order_car_model");
	By complete=By.xpath("order_car_model");
	public boolean checkout() {
		driver.findElement(checkout).click();
		driver.findElement(order).click();
		driver.findElement(picudate).click();
		driver.findElement(time).click();
		driver.findElement(submit).click();
		driver.findElement(color).sendKeys("grey");
		driver.findElement(model).sendKeys("excent");
		driver.findElement(complete).click();
		return true;
		
	}
}
