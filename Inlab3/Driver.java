
/**
 * Driver for the YouTubeVideo.
 * 
 * @author Tristan Mullin 
 * @version 1 Jan 2014
 */
public class Driver {
    public static void main(String[] args) {
        YouTubeVideo sim1 = new YouTubeVideo("How to make good cup of java");
        
      // simulation day 1  
        sim1.increaseDays();  // adds days
        sim1.updateViews(46); // day one's views
        sim1.updateLikes(23); // day one's likes
        
      // simulation day 2
        sim1.increaseDays();
        sim1.updateViews(56); // day two's views
        sim1.updateLikes(38); // day two's likes
      
      // simulation day 3
        sim1.increaseDays();
        sim1.updateViews(23); // day three's views
        sim1.updateLikes(13); // day three's likes
        
      System.out.println(sim1.getName()); //prints videoname
      System.out.println("---------------------------"); 
      System.out.println("View rate: " + sim1.getViewRate() + " views per day."); // prints total views / days
      System.out.println("Like rate: " + sim1.getLikeRate() + " likes per day."); // prints total likes / days
    }
}
