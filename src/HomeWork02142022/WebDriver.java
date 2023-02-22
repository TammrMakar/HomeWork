package HomeWork02142022;

public interface WebDriver {

    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}

class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Opening Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize Windows");
    }

    @Override
    public void findElement() {
        System.out.println("Finding element ");

    }
}
class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Opening Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize Windows");
    }

    @Override
    public void findElement() {
        System.out.println("Finding element ");
    }
}