package BrowserManipulation;

public class aboutLink {
//sets up the links from the home page and corresponding titles
//tech debt - move strings to local variables
//tech debt - reduce duplication
//tech debt - replace with link from home not URL
    static private String aboutPath = "https://www.randstad.com/about-randstad";
    static private String aboutPathTitle = "about Randstad | Randstad Holding";

    //getter for about path link
    public void goTo() {
        Browser.goTo(aboutPath);
        }

        public boolean isAt() {
            return Browser.title().equals(aboutPathTitle);
        }


}
