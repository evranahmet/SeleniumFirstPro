import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_WebDriverTest {
    /*
     Maximize the window
     Open google home page https://www.google.com/
     Wait for 3 seconds
     Go to the https://www.linkedin.com/
     Get the title and URL of the page
     Check if the title contains the word "LinkedIn" print console "Title contains LinkedIn" or "Title does not contain LinkedIn"
     Check if the URL contains the word "LinkedIn" print console "URL contains LinkedIn" or "URL does not contain LinkedIn"
     Then go to https://www.instagram.com/
     Get the title and check if it contains the word "Instagram" and print "Title contains Instagram" or "Title does not contain Instagram"
     Navigate Back to the previous webpage
     Refresh the page
     Navigate to forward
     Wait for 3 seconds
     Close the browser
*/

    public static void main(String[] args) throws InterruptedException {
//        Maximize the window
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        Open google home page https://www.google.com/
        driver.get("https://www.google.com/");

//        Wait for 3 seconds
        Thread.sleep(3000);

//        Go to the https://www.linkedin.com/
        driver.get("https://www.linkedin.com/");

//        Get the title and URL of the page
        String title = driver.getTitle();

//        Check if the title contains the word "LinkedIn" print console "Title contains LinkedIn" or "Title does not contain LinkedIn"
        if (title.contains("LinkedIn")) {//Bu şekilde test yapılmaz. Bir test framework'ü kullanmamız gerekir.(JUnit, TestNG, Cucumber)
            System.out.println("Title contains LinkedIn");
        } else {
            System.out.println("Title does not contain LinkedIn");
        }

//        Check if the URL contains the word "LinkedIn" print console "URL contains LinkedIn" or "URL does not contain LinkedIn"
        String url = driver.getCurrentUrl();
        System.out.println("url = " + url);

        if (url.contains("LinkedIn")) {
            System.out.println("URL contains LinkedIn");
        } else {
            System.out.println("URL does not contain LinkedIn");
        }
//        Then go to https://www.instagram.com/
        driver.get("https://www.instagram.com/");

//        Get the title and check if it contains the word "Instagram" and print "Title contains Instagram" or "Title does not contain Instagram"
        String instaTitle = driver.getTitle();
        System.out.println("instaTitle = " + instaTitle);

        if (instaTitle.contains("Instagram")) {
            System.out.println("Title contains Instagram");
        } else {
            System.out.println("Title does not contain Instagram");
        }
//        Navigate Back to the previous webpage
        Thread.sleep(2000);
        driver.navigate().back();

//        Refresh the page
        Thread.sleep(2000);
        driver.navigate().refresh();

//        Navigate to forward
        Thread.sleep(2000);
        driver.navigate().forward();

//        Wait for 3 seconds
        Thread.sleep(3000);

//        Close the browser
        driver.quit();


    }

}
