package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void takeScreenshot(String name,WebDriver driver) throws IOException {
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\lenovo\\eclipse-workspace\\Saucelabs\\screenshot"+name+".jpeg");
		FileHandler.copy(Source, dest);
	}

}
