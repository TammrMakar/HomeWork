package Project2.Task4;

public class FirefoxDrive implements RemoteWebDriver  {

    String driverName;
    FirefoxDrive(String driverName){
        this.driverName=driverName;

    }

    @Override
    public void openBrowser() {
        System.out.println(driverName+"Opening browser");
    }

    @Override
    public void navigate() {
        System.out.println(driverName+"navigate page");
    }

    @Override
    public void open() {
        System.out.println(driverName+"Opens");
    }

    @Override
    public void close() {
        System.out.println(driverName+"Closes");
    }

    @Override
    public String getTitle() {
        return driverName+"return title";
    }
}
