package BrowserManipulation;

public class Pages {

    //call pages to instantiate a new page

    public static HomePage homePage() {
        HomePage homePage = new HomePage();
        return new HomePage();
    }

    public static JobLink jobLink() {
        JobLink jobLink = new JobLink();
        return new JobLink();
    }

    public static AboutLink aboutLink() {
        AboutLink aboutLink = new AboutLink();
        return new AboutLink();
    }
}
