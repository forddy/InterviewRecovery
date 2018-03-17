package BrowserManipulation;

public class JobLink {
//sets up the links from the home page and corresponding titles
//tech debt - move strings to local variables, reduce duplication

    static private String jobPath = "https://www.randstad.com/find-a-job/";
    static private String jobPathTitle = "find a job | Randstad Holding";

    public void goTo() {
        Browser.goTo(jobPath);
    }
    public boolean isAt() {
        return Browser.title().equals(jobPathTitle);

    }
}
