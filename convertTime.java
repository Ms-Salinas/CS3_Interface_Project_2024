/**
 * Class to convert seconds, minutes, and hours to each other
 */

class convertTime extends UnitConverter {

    /** Constructor */
    public convertTime(double val, double conFac) {
        super();
    }
    
    /** Prints a converted value in time to a different value in time according to the conversion factor */
    public void conTime() {
        double conVal;
        /** seconds to minutes */
        if (getConversionFactor() == 0.00) {
            conVal = getValue()/60;
            System.out.println("" + getValue() + " SECONDS is converted into " + conVal + " MINUTES");
        }
        /** seconds to hours */
        else if (getConversionFactor() == 1.00) {
            conVal = getValue()/3600;
            System.out.println("" + getValue() + " SECONDS is converted into " + conVal + " HOURS");
        }
        /** hours to minutes */
        else if (getConversionFactor() == 2.00) {
            conVal = getValue() * 60;
            System.out.println("" + getValue() + " HOURS is converted into " + conVal + " MINUTES");
        }
        /** hours to seconds */
        else if (getConversionFactor() == 3.00) {
            conVal = getValue() * 3600;
            System.out.println("" + getValue() + " HOURS is converted into " + conVal + " SECONDS");
        }
        /** minutes to hours */
        else if (getConversionFactor() == 4.00) {
            conVal = getValue()/60;
            System.out.println("" + getValue() + " MINUTES is converted into " + conVal + " HOURS");
        }
        /** minutes to seconds */
        else if (getConversionFactor() == 5.00) {
            conVal = getValue()/3600;
            System.out.println("" + getValue() + " MINUTES is converted into " + conVal + " SECONDS");
        }
    }
}
