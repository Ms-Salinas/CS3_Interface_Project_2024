/**
    BaseballStatTracker Interface calculates stats based on certain data
    There are two different players, hitters and pitchers. Pitchers give up hits while hitters get hits.
    atBat for a hitter is playersFaced for a pitcher.
    Averages should be formatted in ".3f", something like ".350"
    To format a print, System.out.printf("Message %.3f", methodReturnsDouble()); - Make sure to print to a new line after with \n.
    @author Joshua Vento-Jones
    @version %I% %G%
 */

 interface BaseballStatTracker {
    
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

// Class definition for BaseballStatsApp containing all components
public class BaseballStatsApp {

    // Class definition for Pitcher
    public static class Pitcher implements BaseballStatTracker {
        String name; // Name of the pitcher
        int hits; // Number of hits given up
        int strikeouts; // Number of strikeouts by the pitcher
        int hittersFaced; // Number of hitters faced
        int walks; // Number of walks given up

        /**
         * Constructor for the Pitcher class.
         * @param name - name of the pitcher
         * @param hits - number of hits given up
         * @param strikeouts - number of strikeouts by the pitcher
         * @param hittersFaced - number of hitters faced
         * @param walks - number of walks given up
         */
        public Pitcher(String name, int hits, int strikeouts, int hittersFaced, int walks) {
            this.name = name;
            this.hits = hits;
            this.strikeouts = strikeouts;
            this.hittersFaced = hittersFaced;
            this.walks = walks;
        }

        @Override
        public double getAvg() {
            return (double) hits / hittersFaced;
        }

        @Override
        public double getStrikeoutAvg() {
            return (double) strikeouts / hittersFaced;
        }

        @Override
        public double getWalkRate() {
            return (double) walks / hittersFaced;
        }

        @Override
        public double getObs() {
            return ((double) walks + hits) / hittersFaced;
        }

        @Override
        public double getOps(int totalBases) {
            return getObs() + ((double) totalBases / hittersFaced);
        }

        @Override
        public double getHomeRunRate(int homers) {
            return (double) homers / hittersFaced;
        }

        /**
         * Prints the stats of the pitcher.
         */
        public void printStats() {
            System.out.printf("Pitcher Name: %s%n", name);
            System.out.printf("Hits Given Up: %d%n", hits);
            System.out.printf("Strikeouts: %d%n", strikeouts);
            System.out.printf("Hitters Faced: %d%n", hittersFaced);
            System.out.printf("Walks: %d%n", walks);
            System.out.printf("Pitching Average Against: %.3f%n", getAvg());
            System.out.printf("Strikeout Average: %.3f%n", getStrikeoutAvg());
            System.out.printf("Walk Rate: %.3f%n", getWalkRate());
            System.out.printf("On-Base Percentage Against: %.3f%n", getObs());
        }
    }

    // Class definition for Hitter
    public static class Hitter implements BaseballStatTracker {
        String name; // Name of the hitter
        int hits; // Number of hits made
        int strikeouts; // Number of strikeouts by the hitter
        int atBats; // Number of at-bats
        int walks; // Number of walks made

        /**
         * Constructor for the Hitter class.
         * @param name - name of the hitter
         * @param hits - number of hits
         * @param strikeouts - number of strikeouts
         * @param atBats - number of at-bats
         * @param walks - number of walks
         */
        public Hitter(String name, int hits, int strikeouts, int atBats, int walks) {
            this.name = name;
            this.hits = hits;
            this.strikeouts = strikeouts;
            this.atBats = atBats;
            this.walks = walks;
        }

        @Override
        public double getAvg() {
            return (double) hits / atBats;
        }

        @Override
        public double getStrikeoutAvg() {
            return (double) strikeouts / atBats;
        }

        @Override
        public double getWalkRate() {
            return (double) walks / atBats;
        }

        @Override
        public double getObs() {
            return ((double) walks + hits) / atBats;
        }

        @Override
        public double getOps(int totalBases) {
            return getObs() + ((double) totalBases / atBats);
        }

        @Override
        public double getHomeRunRate(int homers) {
            return (double) homers / atBats;
        }

        /**
         * Prints the stats of the hitter.
         */
        public void printStats() {
            System.out.printf("Hitter Name: %s%n", name);
            System.out.printf("Hits: %d%n", hits);
            System.out.printf("Strikeouts: %d%n", strikeouts);
            System.out.printf("At Bats: %d%n", atBats);
            System.out.printf("Walks: %d%n", walks);
            System.out.printf("Hitting Average: %.3f%n", getAvg());
            System.out.printf("Strikeout Average: %.3f%n", getStrikeoutAvg());
            System.out.printf("Walk Rate: %.3f%n", getWalkRate());
            System.out.printf("On-Base Percentage: %.3f%n", getObs());
        }
    }

    // Main method to test the BaseballStatTracker implementation
    public static void main(String[] args) {
        // Create a Pitcher instance
        Pitcher pitcher = new Pitcher("John Doe", 30, 15, 100, 5);
        pitcher.printStats(); // Call the method to print all stats for the pitcher

        System.out.println();

        // Create a Hitter instance
        Hitter hitter = new Hitter("Jane Smith", 40, 10, 150, 8);
        hitter.printStats(); // Call the method to print all stats for the hitter
    }
}
