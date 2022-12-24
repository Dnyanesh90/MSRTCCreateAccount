package PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;
import UtilsLayer.HandleDropDown;
import UtilsLayer.RegisterUtilsClass;

public class RegisterPage extends BaseClass {
	
	public void enterFirstName(String firstname) {
		WebElement fname = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		RegisterUtilsClass.checkStatusAndEnterValue(fname, firstname);
	}
	public void enterLastName(String lastname) {
		WebElement lname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		RegisterUtilsClass.checkStatusAndEnterValue(lname, lastname);
	}
	public void clickmale(String gender) {
		WebElement male = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		RegisterUtilsClass.checkStatusAndEnterValue(male, gender);
	}
	public String selectbDate(String bdate) {
		WebElement bday = driver.findElement(By.id("bdate"));
		HandleDropDown.selectValueUsingVisibleText(bday, bdate);
		return HandleDropDown.checkSelectedValue(bday);
	}

	public String selectMonth(String Months) {
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		HandleDropDown.selectValueUsingVisibleText(month, Months);
		return HandleDropDown.checkSelectedValue(month);
	}

	public String selectYear(String Years) {
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		HandleDropDown.selectValueUsingVisibleText(year, Years);
		return HandleDropDown.checkSelectedValue(year);
	}
	public String selectDate(String date) {
		WebElement day = driver.findElement(By.id("//A[@CLASS='ui-state-default ui-state-active']"));
		HandleDropDown.selectValueUsingVisibleText(day, date);
		return HandleDropDown.checkSelectedValue(day);
	}

	public void enterUsername(String uname) {
		WebElement username = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		RegisterUtilsClass.checkStatusAndEnterValue(username, uname);
	}

	public void enterPassword(String pass) {
		WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		RegisterUtilsClass.checkStatusAndEnterValue(password, pass);
	}
	public void reenterPassword(String repass) {
		WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		RegisterUtilsClass.checkStatusAndEnterValue(password, repass);
	}
	public void enteraltUsername(String reuname) {
		WebElement reusername = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		RegisterUtilsClass.checkStatusAndEnterValue(reusername, reuname);
	}
	public void enterMobNo(String mobNo) {
		WebElement mobno = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		RegisterUtilsClass.checkStatusAndEnterValue(mobno, mobNo);
	}
	public void enteraddress(String add) {
		WebElement address = driver.findElement(By.id("address1"));
		RegisterUtilsClass.checkStatusAndEnterValue(address, add);
	}
	public String selectCountry(String Country) {
		WebElement country = driver.findElement(By.xpath("//*[@id=\"country\"]"));
		HandleDropDown.selectValueUsingVisibleText(country, Country);
		return HandleDropDown.checkSelectedValue(country);
	}
	public String selectState(String State) {
		WebElement state = driver.findElement(By.xpath("//*[@id=\"state\"]"));
		HandleDropDown.selectValueUsingVisibleText(state, State);
		return HandleDropDown.checkSelectedValue(state);
	}
	public String selectCity(String City) {
		WebElement city = driver.findElement(By.xpath("//*[@id=\"city\"]"));
		HandleDropDown.selectValueUsingVisibleText(city, City);
		return HandleDropDown.checkSelectedValue(city);
	
	}
}