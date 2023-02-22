package Project2.Task4;

public class WebDriverTester {
    public static void main(String[] args) {

        RemoteWebDriver[] webDrivers = {new ChromeDriver("Chrome"), new FirefoxDrive("Firefox"),
                new SafariDriver("Safari")};


         for (RemoteWebDriver driver:webDrivers){

              driver.open();
              driver.close();
              driver.navigate();
              driver.getTitle();
              driver.openBrowser();
         }


    }}


