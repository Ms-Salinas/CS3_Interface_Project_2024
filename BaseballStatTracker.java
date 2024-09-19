/**
    BaseballStatTracker Interface calculates stats based on certain data
    @author Joshua Vento-Jones
 */

public interface BaseballStatTracker {
    int hits = 0;
    int strikeouts = 0;
    int atBats = 0;
    int walks = 0;



    // Returns amount of hits divided by atBats
    public double getAvg();
    
    // Returns strikeouts divided by atBats
    public double getStrikeoutAvg();

    // Returns on base percent plus slugging (to be calculated)
    public double getOps(int totalBases);

    // Returns rate of walks, walks divided by atBats
    public double getWalkRate();

    // Returns home run rate, parameter divided by total atBats
    public double getHomeRunRate(int homers);

}
