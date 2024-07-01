import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ÖDEV02 {
    /*
     Open google home page https://www.google.com/
     Wait for 3 seconds
     Go to the https://www.youtube.com/
     Get the title and URL of the page
     Check if the title contains the word "YouTube" print console "Title contains YouTube" or "Title does not contain YouTube"
     Check if the URL contains the word "youtube" print console "URL contains youtube" or "URL does not contain youtube"
     Then go to https://www.instagram.com/
     Get the title and check if it contains the word "Instagram" and print "Title contains Instagram" or "Title does not contain Instagram"
     Navigate Back to the previous webpage
     Refresh the page
     Navigate to forward
     Wait for 3 seconds
     Close the browser
*/
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

//        Open google home page https://www.google.com/
        driver.get("https://www.google.com/");

//        Wait for 3 seconds
        Thread.sleep(3000);

//        Go to the https://www.youtube.com/
        driver.get("https://www.youtube.com/");

//        Get the title and URL of the page
        String title = driver.getTitle();
        System.out.println("title = " + title);
        String url = driver.getCurrentUrl();
        System.out.println("url = " + url);

//        Check if the title contains the word "YouTube" print console "Title contains YouTube" or "Title does not contain YouTube"
        System.out.println(title.contains("YouTube") ? "Title contains YouTube" : "Title does not contain YouTube");

//       Check if the URL contains the word "youtube" print console "URL contains youtube" or "URL does not contain youtube"

        System.out.println(url.contains("youtube") ? "URL contains youtube" : "URL does not contain youtube");

//        Then go to https://www.instagram.com/
        driver.get("https://www.instagram.com/");

//        Get the title and check if it contains the word "Instagram" and print "Title contains Instagram" or "Title does not contain Instagram"
        String instagramTitle = driver.getTitle();
        System.out.println("instagramTitle = " + instagramTitle);

        System.out.println(instagramTitle.contains("Instagram") ? "Title contains Instagram" : "Title does not contain Instagram");

//        Navigate Back to the previous webpage
        driver.navigate().back();

//        Refresh the page
        driver.navigate().refresh();

//        Navigate to forward
        driver.navigate().forward();

//        Wait for 3 seconds
        Thread.sleep(3000);

//        Close the browser
        driver.quit();
    }
}
