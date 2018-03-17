package BrowserManipulation;

public class JobLink {
//    sets up the links from the home page and corresponding titles
//tech debt - move strings to local variables
//tech debt - reduce duplication
//tech debt - replace with link from home not URL

    static private String jobLink = "https://www.randstad.com/find-a-job/";
    static private String jobLinkTitle = "find a job | Randstad Holding";

    public void goToJobLink() {
        Browser.goTo(jobLink);
//        below locates the find a job link element in home page but it opens within page - fix later
//         Browser.driver.findElement(By.linkText("find a job")).click();
    }
    public boolean isAt() {
        return Browser.title().equals(jobLinkTitle);

    }

}
