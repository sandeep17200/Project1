package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	

	public static WebDriver driver;
	
	public static WebDriver  launchBrowser(String aname) {
		if(aname.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		
		else if (aname.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}
		
		
		else if (aname.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		return driver;
	}
		
	public static void urlLaunch(String url) {
			driver.get(url);
			driver.manage().window().maximize();
		}
		
	public static void implicityWait(int b) {
			driver.manage().timeouts().implicitlyWait(b, TimeUnit.SECONDS);

		}
	
	public static void sendKeys(WebElement e, String Value) {
		e.sendKeys(Value);

	}
	
	public static void Click(WebElement e) {
		e.click();

	}
	
	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
		
		
		
}
	
	public static String title() {
		String title = driver.getTitle();
		return title;
		

	}
	
	public static void quit() {
		driver.quit();

	}
	
	public static String getText(WebElement e) {
		String text = e.getText();
		return text;
		

	}
	
	public static String getAttribute(WebElement e) {
		String attribute = e.getAttribute("value");
		return attribute;

	}
	public static void moveToelement(WebElement e) {
			Actions a=new Actions (driver);
			a.moveToElement(e).perform();

		}
	
	public static void DragandDrop(WebElement from, WebElement to) {
		Actions a=new Actions (driver);
		a.dragAndDrop(from, to).perform();
		

	}
	
	public static void DoubleClick() {
		Actions a=new Actions (driver);
		a.doubleClick().perform();

	}
	
	public static void ContextClick() {
		Actions a=new Actions (driver);
		a.contextClick().perform();

	}
	
	public static void ClickandHold(WebElement from) {
		Actions a=new Actions (driver);
		a.clickAndHold(from).perform();

	}
	
	public static void Release(WebElement to) {
		Actions a=new Actions (driver);
		a.release(to).perform();
		
		
	}
		
	public static void SelectbyIndex(WebElement e,int a) {
		Select s=new Select (e);
		s.selectByIndex(a);
		
	}
	
	public static void SelectbyVisibletext(WebElement e,String f ) {
		Select s=new Select (e);
		s.selectByVisibleText(f);
		

	}
	
	public static  void selectByValue(WebElement e,String f) {
		Select s=new Select (e);
		s.selectByValue(f);
		

	}
	
	public static  boolean isMultiple(WebElement e) {
		Select s=new Select (e);
		boolean multiple = s.isMultiple();
		return multiple;
		
}
	public static void deselectByIndex(WebElement e,int a) {
		Select s=new Select (e);
		s.deselectByIndex(a);
	}
	
	public static void deselectByValue(WebElement e,String f) {
		Select s=new Select (e);
		s.deselectByValue(f);
	}
	
	public static void deselectVisibleText(WebElement e,String f) {
		Select s=new Select (e);
		s.selectByVisibleText(f);

	}
	
	public static List<WebElement>  getoptions(WebElement e) {
		Select s=new Select (e);
		List<WebElement> options = s.getOptions();
		return options;
		
		
		}
	
	public static void jsSendkeys(String a,WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAttribute('value','"+a+"')", e);
	}
	
	public static void jsScrollDown(WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeAsyncScript("arguments[0].scrollIntoView(true)", e);
	

	}
	public static void jsScrollUp(WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeAsyncScript("arguments[0].scrollIntoView(false)", e);
	}
	
		public static void takeScreenShot(String filename) throws IOException {
		TakesScreenshot tk=(TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File f=new File("C:\\Users\\dell\\eclipse-workspace\\Mvn\\ss\\"+filename+".png");
		FileUtils.copyFile(src, f);
	
	}
	
	public static void clear(WebElement e) {
		e.clear();
		

	}
	
	 public static String Exceldatadriven(String filename,String Sheet,int Row,int c) throws IOException {
		File F=new File("C:\\Users\\dell\\eclipse-workspace\\Excelproject\\src\\test\\resources\\excel\\"+filename+".xlsx");
		FileInputStream st=new FileInputStream(F);
		Workbook w=new XSSFWorkbook(st);
		
		Sheet s = w.getSheet(Sheet);
		Row r = s.getRow(Row);
		Cell cell = r.getCell(c);
		int type = cell.getCellType();
		String value=null;
		
		if (type==1) {
			 value = cell.getStringCellValue();
			
		}
		else {
			if(DateUtil.isCellDateFormatted(cell)) {
			Date cellvalue = cell.getDateCellValue();
			SimpleDateFormat sd=new SimpleDateFormat("dd/mm/yyyy");
			 value = sd.format(value);
		}
			else {
				double numericCellValue = cell.getNumericCellValue();
				long num=(long)numericCellValue;
				value = String.valueOf(num);
				
			}
		}
		return value;
		
	 }
}


