package TestLayer;

import java.io.IOException;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;
import UtilsLayer.RegisterUtilsClass;

public class RegisterPageTest extends BaseClass{

	public static void main(String[] args) throws IOException {

		BaseClass.inilization();
		
		RegisterPage registerpage =new RegisterPage();
		registerpage.enterFirstName("DNYANESHWAR VYANKATRAO");
		registerpage.enterLastName("KADAM");
		registerpage.clickmale("gender");
		//String bdate =registerpage.selectbDate("02");
		//System.out.println(bdate);
		//String month=registerpage.selectMonth("JUL");
		//System.out.println(month);
		//String year =registerpage.selectYear("1990");
		//System.out.println(year);
		String date =registerpage.selectDate("02");
		System.out.println(date);
		registerpage.enterMobNo("7507847874");
		String country=registerpage.selectCountry("India");
		System.out.println(country);
		String city=registerpage.selectCity("Pune");
		System.out.println(city);
		registerpage.enterUsername("dnyanakadam@gmail.com");
		registerpage.enterPassword("kadam@123");
		registerpage.reenterPassword("kadam@123");
		registerpage.enteraltUsername("dnyanakadam@gmail.com");
		RegisterUtilsClass.takeScreenshot("b");
		
		//driver.close();
	}

}
