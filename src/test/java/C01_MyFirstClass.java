import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_MyFirstClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.driver","resources/driver/chromedriver.exe");

        //Driver objesi oluştur
        WebDriver driver = new ChromeDriver();

        //driver methodlarını kullan
        driver.get("https://www.amazon.com.tr/");

        //close browser
        driver.close();//close() methodu ile son açılan pencere kapatılır
        driver.quit();//quit() methodu ile oturumda açılan tüm pencereler kapatılır

    }
}
