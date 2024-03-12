package aday11;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Set <Cookie>cookies= driver.manage().getCookies();
		System.out.println("size of Cookies"+ cookies.size());
		for(Cookie cookie: cookies)
		{
			System.out.println(cookie.getName());
			System.out.println(cookie.getValue());
		}
		Cookie cobj= new Cookie("MyCookie","123456");
		driver.manage().addCookie(cobj);
		cookies=driver.manage().getCookies();
		System.out.println("size of after adding Cookies"+ cookies.size());
		for(Cookie cookie: cookies)
		{
			System.out.println(cookie.getName());
			System.out.println(cookie.getValue());
		}
	}

}
