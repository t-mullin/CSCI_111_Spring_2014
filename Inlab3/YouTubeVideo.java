
/**
 * Takes in a videos name, views, likes, and days and compiles the data .
 * 
 * @author Tristan Mullin 
 * @version 1 Jan 2014
 */
public class YouTubeVideo {
    // Instance Variables
    private String videoName;       // varible for the videos name
    private int numViews;           // varible for the videos views  
    private int numLikes;           // varible for the videos likes
    private int daysSinceUpload;    // varible for days since video upload
    
    //Constuctors
    // takes in the videos name
    public YouTubeVideo(String inName) {
        videoName = inName;
    }
    
    // sets the name of the video
    public String getName() {
        return videoName;
    }
    
    //Methods
    // takes the passed views and add the current views
    public void updateViews(int newViews) {
        numViews += newViews;
    }
    
    // takes the passed likes and add the current likes 
    public void updateLikes(int newLikes) {
        numLikes += newLikes;
    }
    
    // takes the total views and divides by days since the upload
    public double getViewRate() {
        return (double) numViews / daysSinceUpload; 
    }
    
    // takes the total likes and divides by days since the upload
    public double getLikeRate() {
        return (double) numLikes / daysSinceUpload;
    }
    
    // increase the day counter by 1
    public void increaseDays () {
        daysSinceUpload++;
    }
}
