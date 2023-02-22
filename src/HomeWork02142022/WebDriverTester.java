package HomeWork02142022;

public interface WebDriverTester {
    public static void main(String[] args) {

        WebDriver []webdriver={new ChromeDriver(),new FirefoxDriver()};

        for (WebDriver webDriver:webdriver){
            webDriver.openBrowser();
            webDriver.closeBrowser();
            webDriver.maximizeWindow();
            webDriver.findElement();

        }



    }

}
