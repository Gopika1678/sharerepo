package cloud;
import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import pommodel.login;
import pommodel.dashboard;
import pommodel.technical;
import pommodel.searchbtn;
import pommodel.vesseltechnical;
public class centralfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/Downloads/chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://dev.fleett.cloudnautical.com/dashboard");
		login loginpage=new login(driver);
		loginpage.loginpg();
		dashboard dashb=new dashboard(driver);
		dashb.dashexplorer();
		technical techdetails=new technical(driver);
		techdetails.tech();
		searchbtn search=new searchbtn(driver);
		search.searchvessel();
		search.selectvessel();
		vesseltechnical vessel=new vesseltechnical(driver);
		vessel.vessel();
		
		////span[@class=' truncate group-hover/item:w-[140px]']
		////p[contains(@class,'w-max')][normalize-space()='Technical']
	}

}
