package org.Utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Driver;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.commons.compress.archivers.sevenz.CLI;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.codeborne.selenide.commands.TakeScreenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	private static final JavascriptExecutor JavascriptExecutor = null;
	public static WebDriver driver;


	//1. Launch browser

	public static void LaunchBrowser() throws Throwable
	{
		Properties prop = new Properties();
		prop.load(new FileInputStream("./Config.properties"));
		String Browser = prop.getProperty("browser");
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else 
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();	
		}	
	}

	//2.Get URL 

	public static void GetURL() throws Throwable
	{
		Properties prop = new Properties();
		prop.load(new FileInputStream("./Config.properties"));
		String url = prop.getProperty("url");
		driver.get(url);		
	}

	//3.SendKey
	public static void SendKeyy(WebElement ele , String value)
	{
		WebDriverWait wait = new WebDriverWait(driver, 1);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.sendKeys(value);	
	}

	//4. Clicks
	public static void Clicks(WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();	
	}

	//5. PassScreenshot
	public static String Passscreenshots(String testName) throws Throwable
	{
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		String screenshotName = testName + "_" + timestamp + ".png";
		String destinationPath = System.getProperty("user.dir") + "/AgencyLite/PassScreenshot/" + screenshotName;
		File destination = new File(destinationPath);
		FileUtils.copyFile(src, destination);
		return destinationPath;	
	}



	public static String Failcreenshots(String testName) throws Throwable
	{
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		String screenshotName = testName + "_" + timestamp + ".png";
		String destinationPath = System.getProperty("user.dir") + "/Failedscreenshots/" + screenshotName;
		File destination = new File(destinationPath);
		FileUtils.copyFile(src, destination);
		return destinationPath;	
	}


	// 6.Failedscreenshot
	public static String Failedscreenshots(String testName) throws IOException {

		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		String screenshotName = testName + "_" + timestamp + ".png";
		String folderPath = System.getProperty("user.dir") + "/Failedscreenshots/";
		File dir = new File(folderPath);
		if (!dir.exists())
		{
			dir.mkdirs();
		}
		String destinationPath = folderPath + screenshotName;
		File destination = new File(destinationPath);
		FileUtils.copyFile(src, destination);

		System.out.println("Saved at: " + destinationPath);

		return destinationPath;

	}

	//7. Maximize screen
	public static void Maximize()
	{
		driver.manage().window().maximize();
	}

	//8. Implicit wait
	public static void implicitwait()
	{
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	//9.explicitwait
	public static void Explictwait(WebElement ele)
	{
		WebDriverWait waitclickable = new WebDriverWait(driver, 80);
		//WebDriverWait waitclickable = new WebDriverWait(driver, Duration.ofSeconds(80));
		waitclickable.until(ExpectedConditions.elementToBeClickable(ele));
	}


	// get the data from excel sheet
	public static String getdataxlsheet(int sheetnum, int rownumber, int cellnumber) throws IOException {

		File f = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Credentialss.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet sheet = w.getSheetAt(sheetnum);
		Row row = sheet.getRow(rownumber);
		Cell cell = row.getCell(cellnumber);
		int cellType = cell.getCellType();
		String value = "";
		if (cellType == 1) {
			value = cell.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(cell)) {
			Date dat = cell.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd mmm yyyy");
			value = sim.format(dat);
		} else {
			double num = cell.getNumericCellValue();
			long l = (long) num;
			value = String.valueOf(l);
		}
		return value;
	}
	
	
	public static String getdata2xlsheet(int sheetnum, int rownumber, int cellnumber) throws IOException {

		File f = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\testcase.xlsx");
		// File f = new
		// File("C:\\Users\\INFINITI\\eclipse-workspace\\GrmGol\\src\\test\\resources\\Test_data\\credentialss.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet sheet = w.getSheetAt(sheetnum);
		Row row = sheet.getRow(rownumber);
		Cell cell = row.getCell(cellnumber);
		int cellType = cell.getCellType();
		String value = "";
		if (cellType == 1) {
			value = cell.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(cell)) {
			Date dat = cell.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd mmm yyyy");
			value = sim.format(dat);
		} else {
			double num = cell.getNumericCellValue();
			long l = (long) num;
			value = String.valueOf(l);
		}
		return value;
	}

//datepicks
	public static void datepicks(String ref) throws Throwable {

		LocalDate currentDate = LocalDate.now();
		LocalDate futureDate = currentDate.plusDays(Integer.valueOf(ref));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
		String formattedDate = futureDate.format(formatter).trim();
		String[] split = formattedDate.split(" ");
		String day = split[0];
		String month = split[1];
		String year = split[2];
		Thread.sleep(500);
		WebElement year1 = driver.findElement(By.xpath("//div//select[contains(@class, 'ui-datepicker-year')]"));
		Select s = new Select(year1);
		s.selectByVisibleText(year);
		Thread.sleep(500);
		WebElement month1 = driver.findElement(By.xpath("//div//select[contains(@class, 'ui-datepicker-month')]"));
		String mon = month1.getText().trim().substring(0, 3);
		Select select = new Select(month1);
		select.selectByVisibleText(mon);
		Thread.sleep(500);
		WebElement date = driver
				.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td//a[text()=" + day + "]"));
		Thread.sleep(500);
		Clicks(date);
	}

	// Scroll down
	public static void javascriptscrolldown(WebElement ref) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", ref);

	}

	// Scroll up
	public static void javascriptscrollup(WebElement ref)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ref);
	}


	//9.explicitwaitforlist
	public static void Explictwaitforlist(List<WebElement> ele)
	{
		WebDriverWait waitclickable = new WebDriverWait(driver, 60);
		//WebDriverWait waitclickable = new WebDriverWait(driver, Duration.ofSeconds(60));		
		waitclickable.until(ExpectedConditions.visibilityOfAllElements(ele));
	}

	// Java script click
	public static void javascriptclick(WebElement ref) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ref);

	}

	// Mouse Enter
	public static void Enter() throws AWTException
	{
		Actions A = new Actions(driver);
		A.sendKeys(Keys.ENTER).build().perform();
	}
	
	public void Down()
	{
		Actions A = new Actions(driver);
		A.sendKeys(Keys.DOWN).build().perform();
	}


	// Wait for page stable
	public void waitForPageLoad() 
	{
		WebDriverWait wait = new WebDriverWait(driver, 90);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(new Function<WebDriver, Object>() {
			public Object apply(WebDriver webDriver) {
				return ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState")
				.equals("complete");
			}
		}
				);
	}

	public static void excellwrite(int sheetnum, int rownum, int cellnum, String value) throws Throwable {

		File f = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\testcase.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet sheet = w.getSheetAt(sheetnum);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		cell.setCellValue(value);
		FileOutputStream filll = new FileOutputStream(f);
		w.write(filll);

	}

	public static void Mouseclick(WebElement ele)
	{
		Actions action = new Actions(driver);
		action.click(ele).build().perform();
	}

	public static void dateselect(String days) throws Throwable {

		LocalDate currentDate = LocalDate.now();
		LocalDate futureDate = currentDate.plusDays(Integer.valueOf(days));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
		String formattedDate = futureDate.format(formatter).trim();
		String[] split = formattedDate.split(" ");
		String day = split[0];
		String month = (String) split[1].subSequence(0, 3);
		String year = split[2];
		WebElement year1 = driver.findElement(By.xpath("//div//select[contains(@class, 'ui-datepicker-year')]"));
		Select s = new Select(year1);
		s.selectByVisibleText(year);
		Thread.sleep(500);
		WebElement month1 = driver.findElement(By.xpath("//div//select[contains(@class, 'ui-datepicker-month')]"));
		Select se = new Select(month1);
		Thread.sleep(1000);
		se.selectByVisibleText(month);
		WebElement date = driver
				.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td//a[text()=" + day + "]"));
		Clicks(date);
	}

	//
	public static void Clearr(WebElement ele)
	{
		WebDriverWait w = new WebDriverWait(driver, 5);
		//WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOf(ele));
		ele.clear();
	}


	public static void Currentwindow(String url)
	{
		driver.switchTo().window(url);
	}


	public void selectDate(String year, String month, String date) {

		String target = month + " " + year;
		for (int i = 0; i < 12; i++) {
			List<WebElement> months = driver.findElements(By.xpath("//div[contains(@class,'ui-datepicker-title')]"));
			for (WebElement m : months) {
				if (m.getText().equalsIgnoreCase(target)) {
					WebElement selectdate = driver.findElement(By.xpath("//td[@data-year='" + year + "' and @data-month='" + getMonthNumber(month) + "']" + "//a[@data-date='" + date + "']"));
					javascriptclick(selectdate);
					return;
				}
			}
			WebElement Next =   driver.findElement(By.xpath("//a[contains(@class,'ui-datepicker-next')]"));
			javascriptclick(Next);
		}
		throw new RuntimeException("Date not found");
	}
	public String getMonthNumber(String month) {
		return String.valueOf(
				Month.valueOf(month.toUpperCase()).getValue() - 1);
	}
	
	// Dropdown by index
	public void Selectdropdownbyindex(WebElement ele, int value)
	{
		Select s = new Select(ele);
		s.selectByIndex(value);
	}
	// Dropdown by Value
	public void Selectdropdownbyvalue(WebElement ele, String value)
	{
		Select s = new Select(ele);
		s.selectByValue(value);
	}
	
	// Dropdown by Visibletext
	public void Selectdropdownbyvisibletext(WebElement ele, String value)
	{
		Select s = new Select(ele);
		s.selectByVisibleText(value);
	}
	
	public void mousehover(WebElement ele)
	{
		Actions action = new Actions(driver);
		action.moveToElement(ele);
	}
	

}






