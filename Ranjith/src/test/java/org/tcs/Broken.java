package org.tcs;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Broken {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		start = start / 1000;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.amazon.com/");
		int count = 0;
		int count2 = 0;
		List<WebElement> findElements = driver.findElements(By.tagName("a"));
		for (int i = 0; i < findElements.size(); i++) {
			WebElement link = findElements.get(i);
			String urllink = link.getAttribute("href");
			if (urllink != null) {
				if (urllink.contains("http")) {
					URL url = new URL(urllink);
					URLConnection openConnection = url.openConnection();
					HttpURLConnection http = (HttpURLConnection) openConnection;
					int responseCode = http.getResponseCode();
					if (responseCode == 200) {
						count++;
						System.out.println("Successful Link:  " + responseCode + "\t" + urllink);
					} else {
						count2++;
						System.out.println("Broken Link:  " + responseCode + "\t" + urllink);
					}}}}
		System.out.println("SUCCESSFUL LINKS = " + count);
		System.out.println("FAILURE LINKS = " + count2);
		long end = System.currentTimeMillis();
		end = end / 1000;
		System.out.println(end - start + "Sec");
		driver.quit();
	}

}
