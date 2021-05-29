package CommonClass;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinBase {
	public static WebDriver driver;

	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void sendKeys(WebElement element, String testdata) {
		element.sendKeys(testdata);
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void select(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	public static void selectIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	public static String excelRead(int rownum, int cellnum) throws IOException {
		File f = new File("C:\\Users\\HP\\eclipse-workspace\\MavenProject\\xlsheet\\cou.xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("Sheet1");
		Row row = s.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String stringCellValue = cell.getStringCellValue();
		return stringCellValue;
	}

	public static String excelReadPh(int rownum, int cellnum) throws IOException {
		File f = new File("C:\\Users\\HP\\eclipse-workspace\\MavenProject\\xlsheet\\cou.xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("Sheet1");
		Row row = s.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		double numericCellValue = cell.getNumericCellValue();
		long l = (long) numericCellValue;
		String x = String.valueOf(l);
		return x;
	}

	public static String getAttri(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

}
