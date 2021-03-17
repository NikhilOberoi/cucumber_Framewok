package screenshot;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import configure.configLoad;
//import stepDefinations.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screenShot {
//	static WebDriver driver = stepDefinations.Steps.driver;;
	public static void takeScreenshot(WebDriver driver) throws IOException {
		
		//Getting Current Date Time Hours Minutes and Seconds
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat fm = new SimpleDateFormat("MM_DD_YYYY_hh_mm_ss_z");
		String curr_Date = fm.format(cal.getTime());
		System.out.println("Current Date " + curr_Date);
		
		//Convert Web Object to Take ScreenShot.
		TakesScreenshot ss = (TakesScreenshot) driver;
		File ss_file = ss.getScreenshotAs(OutputType.FILE);
		configure.configLoad.loadProperties();
		System.out.println("Screenshsot Path : " + System.getProperty("user.dir")
				+ configure.configLoad.prop.getProperty("screenShot_Path") + curr_Date + ".jpg");
		FileHandler.copy(ss_file, new File(System.getProperty("user.dir")
				+ configure.configLoad.prop.getProperty("screenShot_Path") + curr_Date + ".jpg"));
	}
}
