package Utilites;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static Object takescreenshot;

	public static String takescreenshot(WebDriver driver, String testname) throws IOException {
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        File dest = new File ("C:\\Users\\pc\\eclipse-workspace\\Ezratest\\screenshot\\"+testname+".png");
	        FileHandler.copy(source, dest);  
	        return testname;
			        
	}
}
