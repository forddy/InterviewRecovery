package BrowserManipulation;

public class HomePage {

    static private String homeUrl = "https://randstad.com";
    static private String homeUrlTitle = "Randstad";

    public void goTo() {
        Browser.goTo(homeUrl);
    }

    public boolean isAt() {
        return Browser.title().equals(homeUrlTitle);

    }

}