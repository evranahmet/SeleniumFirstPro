import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ÖDEV01 {

    /*
 Go to the Clarusway URL : https://www.clarusway.com/
 Print the position and size of the page.
 Adjust the position of the page as:
     xCoordinate: 70
     yCoordinate: 70
 Adjust the size of the page as:
     height: 900
     width: 900
 Close the page.
*/
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.clarusway.com/");
        driver.manage().window().setPosition(new Point(70,70));
        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        driver.manage().window().setSize(new Dimension(900,900));
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());
        driver.close();
    }

}
