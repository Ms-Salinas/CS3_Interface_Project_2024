/**
    BaseballStatTracker Interface calculates stats based on certain data
    There are two different players, hitters and pitchers. Pitchers give up hits while hitters get hits.
    atBat for a hitter is playersFaced for a pitcher.
    Averages should be formatted in ".3f", something like ".350"
    To format a print, System.out.printf("Message %.3f", methodReturnsDouble()); - Make sure to print to a new line after with \n.
    @author Joshua Vento-Jones
    @version %I% %G%
 */

public interface BaseballStatTracker {
    
    // Holds String name for the player.
    String name = "";

    // Returns amount of hits divided by atBats, for players, this is their hitting average. For pitchers, this is the average against.
    public double getAvg();
    
    // Returns strikeouts divided by atBats for hitters, strikeouts divided by hittersFaced for pitchers.
    public double getStrikeoutAvg();

    // Returns rate of walks -- all walks divided by atBats/playersFaced. This is the average of walks in all at bats.
    public double getWalkRate();

    // Returns the on base percent, the sum of walks and hits divided by the total atBats/playersFaced.
    public double getObs();

    // Returns on base percent plus slugging (totalBases divided by total atBats/playersFaced)
    // @param {int} totalBases - total amount of bases the player has accumulated or given up.
    public double getOps(int totalBases);

    // Returns a home run rate, homers divided by the total atBats/hittersFaced. This is the player's homerun average.
    // @param {int} homers - Total amount of homeruns the player has accumulated or given up.
    public double getHomeRunRate(int homers);

}
